package 排序算法;

/**
 * @Author: lilinglin
 * @Description:
 * @Date: Created in 2018/6/17
 */
public class QuickSort {
    public static void sort(int[] a,int l,int r){
        if(l<0 || l>=a.length || r<0 || r>=a.length) return;
        if(l>=r){
            return;
        }
        int start = l;
        int end = r;
        int target = a[start];

        while(start<end){

            while(a[end]>=target && start<end){
                end--;
            }

            while(a[start]<=target && start<end){
                start++;
            }

            change(a,start,end);
        }

        change(a,l,start);
        sort(a,l,start-1);
        sort(a,start+1,r);
    }


    public static void change(int[] a,int start,int end){
        int temp = a[start];
        a[start] = a[end];
        a[end] = temp;
    }

}
