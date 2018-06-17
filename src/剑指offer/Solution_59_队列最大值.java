package 剑指offer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @Author: lilinglin
 * @Description:
 * @Date: Created in 2018/6/17
 */
public class Solution_59_队列最大值 {
    /**
     * 滑动窗口最大值
     * @param num
     * @param size
     * @return
     */
    public static ArrayList<Integer> maxInWindows(int [] num, int size)
    {
        ArrayList<Integer> list = new ArrayList<>();
        int length = num.length;
        if(length==0 || size == 0 || length<size){
            return list;
        }
        LinkedList<Integer> linkedListWindow = new LinkedList<>();
        LinkedList<Integer> linkedListMax = new LinkedList<>();

        for (int i = 0;i<length;i++){
            if(i<size){
                linkedListWindow.add(i);
            }else {
                int removeIndex = linkedListWindow.getFirst();
                linkedListWindow.removeFirst();
                linkedListWindow.add(i);
                if(removeIndex==linkedListMax.getFirst()){
                    linkedListMax.removeFirst();
                }
            }



            if(linkedListMax.size()==0){
                linkedListMax.add(i);
            }else {
                int max = linkedListMax.getFirst();
                if(num[max]<=num[i]){
                    linkedListMax.clear();
                    linkedListMax.add(i);
                }else if(num[max]>num[i]){
                    int min = linkedListMax.getLast();
                    while (num[min]<=num[i]){
                        linkedListMax.removeLast();
                        min = linkedListMax.getLast();
                    }
                    linkedListMax.add(i);
                }
            }

            if(i>=size-1){
                list.add(num[linkedListMax.getFirst()]);
            }
        }
        return list;
    }

    public static void main(String[] args) {

        int[] num = {2,3,4,2,6,2,5,1};
        List<Integer> list = maxInWindows(num,3);
        System.out.println(list.toString());
    }
}
