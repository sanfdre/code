package 剑指offer;

import java.util.Arrays;

/**
 * @Author: lilinglin
 * @Description:
 * @Date: Created in 2018/6/17
 */
public class Solution_3_数组中重复的数字 {
    public static void main(String[] args) {
        int[] array = {2,3,1,0,2,5,3};
        int[] duplication = new int[1];
        System.out.println(duplicate(array,array.length,duplication));
        System.out.println(duplication[0]);
    }
    public static boolean duplicate(int numbers[],int length,int [] duplication) {
        if(numbers==null || numbers.length == 0){
            duplication[0] = -1;
            return false;
        }
        boolean flag = false;
        for (int i = 0;i<length;i++){
            while (i!=numbers[i]){
                if(numbers[numbers[i]] == numbers[i]){
                    duplication[0] = numbers[i];
                    flag = true;
                    return flag;
                }
                change(numbers,i,numbers[i]);
            }
        }
        return flag;
    }

    public static void change(int[] array,int first,int last){
        int temp = array[first];
        array[first] = array[last];
        array[last] = temp;
    }
}
