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

    public static void main(String[] args) {

        try {
            Thread.sleep(20000l);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(1);
        TimeWhellContainer timeWhellContainer = new TimeWhellContainer(1440);
        timeWhellContainer.initTimes();
        timeWhellContainer.times[1].compareAndSetEnd(0,33);
        System.out.println(2);
        try {
            Thread.sleep(1000000l);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
