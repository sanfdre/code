package 时间轮算法容器;
public class TimeWhellContainer extends AbstractTimeWhellContainer{

    public TimeWhellContainer(int wheelNum) {
        super(wheelNum);
    }

    /**
     *  需要用定时器任务调用indexAddOne（）方法实现
     */


    /**
     * 真正过期需要做的方法
     */
    public void realToDo() {

    }

    /**
     * 容器重启初始化  数据库中获取数据插入轮组
     */
    public void init() {

    }
}
