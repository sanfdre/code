package 排序算法;

/**
 * @Author: lilinglin
 * @Description:
 * @Date: Created in 2018/6/17
 */
public class MergeSort {

    public static void main(String[] args) {
        int[] list = {1,4,2,3,6,43,6,7};
        int[] tempArray = new int[list.length];
        MergeSort(list,0,list.length-1,tempArray);
        System.out.println(list);
    }
    /**
     * 归并排序
     * @param list
     */
    public static void MergeSort(int[] list,int left,int right,int[] tempArray){
        if(left==right){
            return;
        }
        int middle = (left+right)/2;
        MergeSort(list,left,middle,tempArray);
        MergeSort(list,middle+1,right,tempArray);

        merge(list,left,middle,middle+1,right,tempArray);
    }

    public static  void merge(int[] list,int leftStart,int leftEnd,int rightStart,int rightEnd,int[] tempArra){
        int indexLeft = leftStart;
        int indexRight = rightStart;
        int right;
        int left;
        for (int i = leftStart; i <= rightEnd; i++) {
            if(indexLeft<=leftEnd && indexRight<=rightEnd){
                right = list[indexRight];
                left = list[indexLeft];
                if (left <= right) {
                    tempArra[i] = left;
                    indexLeft++;
                } else {
                    tempArra[i] = right;
                    indexRight++;
                }
            }else if(indexLeft>leftEnd){
                right = list[indexRight];
                tempArra[i] = right;
                indexRight++;
            }else {
                left = list[indexLeft];
                tempArra[i] = left;
                indexLeft++;
            }

        }
        for (int i = leftStart; i <= rightEnd; i++) {
            list[i] = tempArra[i];
        }
    }
}
