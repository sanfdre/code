package 剑指offer;

import java.util.Arrays;

/**
 * @Author: lilinglin
 * @Description:
 * @Date: Created in 2018/6/17
 */
public class Solution_3_数组中重复的数字 {
    public static void main(String[] args) {
        int[] array = {2,4,3,1,4};
//        int[] array = {2,3,1,0,2,5,3};
        int[] duplication = new int[1];
//        System.out.println(duplicate(array,array.length,duplication));
//        System.out.println(duplication[0]);
        System.out.println(duplicateNotChangeArray(array,array.length,duplication));
        System.out.println(duplication[0]);
    }


    //改变数组内容的算法
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

    //不能改变数组内容  若有多个相同的 只需要输出随便一个相同的就行 这里牛课网不能通过 只有第一种才能通过
    //牛课网要求输出第一个相同的 无法办到
    public static boolean duplicateNotChangeArray(int numbers[],int length,int [] duplication){
        int start = 1;
        int end = length;
        int middle = (start+end)>>1;
        if(end<=start){
            return false;
        }
        while (end>middle && middle>start){
            if(getNums(numbers,start,middle)){
                end = middle;
            }else {
                start = middle;
            }
            middle = (start+end)/2;
        }

        int numsStart = 0;
        int numsEnd = 0;
        for (int i = 0;i<length;i++){
            if(numbers[i] == start){
                numsStart++;
            }else  if(numbers[i] == end){
                numsEnd++;
            }
        }

        if(numsStart>1){
            duplication[0] = start;
            return true;
        }else if(numsEnd>1){
            duplication[0] = end;
            return true;
        }else {
            return false;
        }
    }

    public static boolean getNums(int[] numbers,int start,int end){
        if(start>end){
            return false;
        }

        int nums = 0;
        int shouldNums = end-start+1;
        for (int i = 0;i<numbers.length;i++){
            if(numbers[i]>=start && numbers[i]<=end){
                nums++;
            }
        }
        if(nums>shouldNums){
            return true;
        }else {
            return false;
        }
    }


}
