package 排序算法;

/**
 * @Author: lilinglin
 * @Description:
 * @Date: Created in 2018/6/17
 */
public class BubbleSort {
    /**
     * 冒泡排序
     * @param list
     * @return
     */
    public static Integer[] BubbleSort(Integer[] list){

        if(list==null || list.length==0){
            return null;
        }

        for(int a = list.length-1;a>0;a--){
            for (int b = 0;b<a;b++){
                if(list[b]>list[b+1]){
                    int tep = list[b+1];
                    list[b+1] = list[b];
                    list[b] = tep;
                }
            }
        }
        return list;
    }

}
