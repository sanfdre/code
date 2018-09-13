package 排序算法;

/**
 * @Author: lilinglin
 * @Description:
 * @Date: Created in 2018/6/17
 */
public class HeapSort {
    public static void main(String[] args) {
        int[] array = {1,4,5,3,6,9,7};
        heapSort(array,7);
        System.out.println();
    }

    public static void heapSort(int[] array,int n){

        //元素下沉 构造大根堆
        for (int i = n/2;i>0;i--){
            dataDown(array,i,n);
        }

        //调整节点
        for (int i = n;i>0;i--){
            swap(array,0,i-1);
            dataDown(array,1,i-1);
        }
    }

    public static void dataDown(int[] array,int index,int num){
        if(num<=1){
            return;
        }

        int left = index*2;
        int right = index*2+1;

        while (left<=num){
            if(right<=num){
                if(array[right-1]>array[left-1]){
                    if(array[index-1]<array[right-1]){
                        swap(array,index-1,right-1);
                        index = right;
                    }else {
                        break;
                    }
                }else {
                    if(array[index-1]<array[left-1]){
                        swap(array,index-1,left-1);
                        index = left;
                    }else {
                        break;
                    }
                }
            }else {
                if(array[index-1]<array[left-1]){
                    swap(array,index-1,left-1);
                    index = left;
                }else {
                    break;
                }
            }
            left = index * 2;
            right = index * 2 + 1;
        }
    }

    public static void swap(int[] array,int start,int end){
        int temp = array[start];
        array[start] = array[end];
        array[end] = temp;
    }

}
