package 时间轮算法容器;


import lombok.Data;
import sun.misc.Unsafe;

import java.lang.reflect.Field;
import java.util.concurrent.atomic.AtomicInteger;
import org.springframework.beans.factory.InitializingBean;

public abstract  class AbstractTimeWhell implements InitializingBean{
    /**
     * 轮组指针
     */
    protected volatile int index = 0;

    /**
     * 轮组中槽的数量
     */
    protected int wheelNum;

    /**
     * 轮组对象（带槽数组）
     */
    protected Node[] times;

    /**
     * 定时器到点调度的方法 改变轮组中指针刻度
     */
    public abstract void indexAddOne();

    /**
     * 对时间轮中到期的节点进行实际操作
     */
    public abstract void realDo();

    /**
     * 向时间轮中删除节点
     */
    public abstract void delete(int shareId);

    /**
     * 向时间轮中添加节点
     * @param shareId
     */
    public abstract void add(int shareId);

    /**
     * 过期真正进行操作的（由具体的实现完成）
     */
    public abstract void realToDo(int start,int end);

    /**
     * 项目启动 初始化容器
     */
    public abstract void init();

    /**
     * 初始化数组
     */
    public abstract void initTimes();

    public void afterPropertiesSet() throws Exception {
        initTimes();
        init();
    }

    /**
     * 判断index是否超出范围
     * @param index
     * @return
     */
    protected int getIndex(int index){
        int temp = index;
        if(temp>times.length){
            temp = 0;
        }
        return temp;
    }

    /**
     * 槽节点
     */
    @Data
    static class  Node{
        /**
         * 开始index
         */
        private volatile int start=0;
        /**
         * 结束index
         */
        private volatile int end=0;

        /**
         * 槽状态 0代表初始状态 1代表不准进行添加操作 -1代表可以进行相应操作
         */
        private volatile int state=0;

        /**
         * 每个节点槽的计数器 当计数器为0的时候就不会执行数据库realTodo操作
         */
        private AtomicInteger count=new AtomicInteger(0);

        private static final Unsafe unsafe ;
        private static final long valueOffsetStart;
        private static final long valueOffsetEnd;

        static{
            Field f = null  ; //Internal reference
            try {
                //初始化unsafe
                f = Unsafe.class.getDeclaredField("theUnsafe");
                f.setAccessible(true);
                unsafe = (Unsafe) f.get(null);

                //初始化两个值的位置偏移量
                valueOffsetStart = unsafe.objectFieldOffset
                        (Node.class.getDeclaredField("start"));
                valueOffsetEnd = unsafe.objectFieldOffset
                        (Node.class.getDeclaredField("end"));
            } catch (Exception ex) {
                throw new Error(ex);
            }
        }

        public final boolean compareAndSetStart(int expect, int update) {
            return unsafe.compareAndSwapInt(this, valueOffsetStart, expect, update);
        }

        public final boolean compareAndSetEnd(int expect, int update) {
            return unsafe.compareAndSwapInt(this, valueOffsetEnd, expect, update);
        }
    }

}
