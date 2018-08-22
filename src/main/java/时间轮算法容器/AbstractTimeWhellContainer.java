package 时间轮算法容器;
public abstract class AbstractTimeWhellContainer extends AbstractTimeWhell{

    public AbstractTimeWhellContainer(int wheelNum) {
        this.wheelNum = wheelNum;
    }

    public void indexAddOne(){
        //将start设置为1 代表不准进行添加
        times[getIndex(index+1)].setState(1);
        index++;
        if(index>=times.length){
            index = 0;
        }
    }

    public void realDo(){
        int temp = getIndex(index);
        if(times[temp].getCount().get()>0){
            //进行数据库撤回操作 异步线程池
            realToDo();
        }
        //将start设置为-1 代表操作过了
        times[temp].setState(-1);
    }

    public void delete(int shareId){
        //for循环 根据。start end找到对应的node
        //count--;
    }

    //先添加节点 数据库再入库
    public void add(int shareId) {
        int temp = getIndex(index);
        Node node = times[temp];
        //等待realDo()方法执行完成
        while (node.getState() ==1 ){
            try {
                Thread.sleep(1000l);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        //cas操作 只要比start小的 都把它设置为start
        //cas操作 只要比end小的 都把它设置为end
        int start = node.getStart();
        int end = node.getEnd();

        while (start>shareId){
            node.compareAndSetStart(start,shareId);
            start = node.getStart();
        }

        while (end<shareId){
            node.compareAndSetEnd(end,shareId);
            end = node.getEnd();
        }
    }

    public  void initTimes(){
        times = new Node[wheelNum];
        for (int i = 0;i<wheelNum;i++){
            times[i] = new Node();
        }
    }
}
