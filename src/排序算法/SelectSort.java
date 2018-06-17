package 排序算法;

/**
 * @Author: lilinglin
 * @Description:
 * @Date: Created in 2018/6/17
 */
public class SelectSort {
    /**
     * 选择排序
     * @return
     */
    public static Integer[] SelectSort(Integer[] list){

        if(list==null || list.length==0){
            return null;
        }

        Integer minIndex =0;
        for(int a = 0;a<list.length-1;a++){
            for (int b = a;b<list.length;b++){
                if(list[minIndex]>list[b]){
                    minIndex = b;
                }
            }
            Integer temp = list[minIndex];
            list[minIndex] = list[a];
            list[a] = temp;
        }
        return list;
    }

}
