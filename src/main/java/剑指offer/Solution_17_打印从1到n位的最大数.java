package 剑指offer;

/**
 * @Author: lilinglin
 * @Description:
 * @Date: Created in 2018/8/7
 */
public class Solution_17_打印从1到n位的最大数 {
    public static void printN(int n){
        int[] array  = new int[n+1];
        printArray(array,1,n);
    }

    public static void printArray(int[] array,int index,int length){
        if(index==length){
            for (int i=0;i<=9;i++){
                array[index] = i;
                print(array);
            }
            return;
        }
        for (int i=0;i<=9;i++){
            array[index] = i;
            int temp = index+1;
            printArray(array,temp,length);
        }
    }

    public static void print(int[] array){
        boolean flag = false;
        for (int i = 1;i<array.length;i++){
            if(array[i]!=0){
                flag = true;
            }
            if(flag){
                System.out.printf(String.valueOf(array[i]));
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        printN(100);
    }
}
