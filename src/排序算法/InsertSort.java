package 排序算法;

/**
 * @Author: lilinglin
 * @Description:
 * @Date: Created in 2018/6/17
 */
public class InsertSort {
    /**
     * 插入排序
     * @param list
     */
    public static void InsertSort(Integer[] list){
        if(list==null || list.length==0){
            return;
        }
        int index;
        for (int a = 1;a<list.length;a++){
            index = a;
            while (index>0){
                if(list[index]<list[index-1]){
                    int tep = list[index];
                    list[index] = list[index-1];
                    list[index-1] = tep;
                    index--;
                }else {
                    break;
                }
            }
        }

    }
}
