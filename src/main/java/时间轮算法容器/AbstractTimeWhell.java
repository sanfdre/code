package 时间轮算法容器;


import sun.misc.Unsafe;

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
    protected Node[] times = new Node[wheelNum];

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
     * 过期真正进行操作的（由具体的实现完）
     */
    public abstract void realToDo();

    /**
     * 项目启动 初始化容器
     */
    public abstract void init();

    public void afterPropertiesSet() throws Exception {
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
    static class  Node{
        private static final Unsafe unsafe = Unsafe.getUnsafe();
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
        private AtomicInteger count=new AtomicInteger(0);

        private static final long valueOffsetStart;
        private static final long valueOffsetEnd;

        static{
            try {
                valueOffsetStart = unsafe.objectFieldOffset
                        (Node.class.getDeclaredField("start"));
                valueOffsetEnd = unsafe.objectFieldOffset
                        (Node.class.getDeclaredField("end"));
            } catch (Exception ex) { throw new Error(ex); }
        }

        public final boolean compareAndSetStart(int expect, int update) {
            return unsafe.compareAndSwapInt(this, valueOffsetStart, expect, update);
        }

        public final boolean compareAndSetEnd(int expect, int update) {
            return unsafe.compareAndSwapInt(this, valueOffsetEnd, expect, update);
        }


        public int getStart() {
            return start;
        }

        public void setStart(int start) {
            this.start = start;
        }

        public int getEnd() {
            return end;
        }

        public void setEnd(int end) {
            this.end = end;
        }

        public AtomicInteger getCount() {
            return count;
        }

        public void setCount(AtomicInteger count) {
            this.count = count;
        }

        public int getState() {
            return state;
        }

        public void setState(int state) {
            this.state = state;
        }
    }

}
