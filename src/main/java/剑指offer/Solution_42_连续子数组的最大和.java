package 剑指offer;

/**
 * @Author: lilinglin
 * @Description:
 * @Date: Created in 2018/6/17
 */
public class Solution_42_连续子数组的最大和 {
    public int FindGreatestSumOfSubArray(int[] array) {
        //根据数组规律
//        int result = Integer.MIN_VALUE;
//        int max = 0;
//
//        for (int i = 0;i<array.length;i++){
//            max += array[i];
//            if(max>result){
//                result = max;
//            }
//
//            if(max<0){
//                max = 0;
//            }
//        }
//        return result;

        //动态规划 找到没个的最大值
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if(i!=0 && array[i-1]>0){
                    array[i] += array[i-1];
            }
            if(array[i]>max){
                max = array[i];
            }
        }
        return max;
    }
}
