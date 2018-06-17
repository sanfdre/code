package 排序算法;

/**
 * @Author: lilinglin
 * @Description:
 * @Date: Created in 2018/6/17
 */
public class QuickSort {
    /**
     * 快速排序
     * @param list
     */
    public static void QuickSort(Integer[] list,int left,int right){
        if(list==null || list.length==0){
            return;
        }

        int low  = left;
        int high = right;
        int temp = list[low];

        if(low<high){
            while (low<high){
                while (temp<=list[high] && low<high){
                    high--;
                }
                while (temp>=list[low] && low<high){
                    low++;
                }
                if(low<high){
                    int t = list[high];
                    list[high] = list[low];
                    list[low] = t;
                }

            }

            list[left] = list[low];
            list[low] = temp;
            QuickSort(list,left,low-1);
            QuickSort(list,low+1,right);
        }else {
            return;
        }

    }

    public static void QuickSort1(int[] list,int left,int right){

        if(list == null || list.length==0){
            return;
        }

        int low = left;
        int high = right;
        int temp = list[low];

        if(low<high){
            while (low<high){
                while (list[low]<= temp&& low<high){
                    low++;
                }
                while (list[high]>=temp && low<high){
                    high--;
                }

                if(low<high){
                    int t = list[high];
                    list[high] = list[low];
                    list[low] = t;
                }
            }

            list[left] = list[low];
            list[low] = temp;
            QuickSort1(list,left,low-1);
            QuickSort1(list,low+1,right);

        }else {

        }
    }



}
