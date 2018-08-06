package 剑指offer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @Author: lilinglin
 * @Description:
 * @Date: Created in 2018/6/17
 */
public class Solution_14_剪绳子 {

    /**
     * 动态规划
     * @param length
     * @return
     */
   public static int getMax1(int length){
       if(length == 2){
           return 1;
       }
       if(length == 3){
           return 2;
       }
       if(length == 4){
           return 4;
       }
       int[] max = new int[length+1];

       max[1] = 1;
       max[2] = 2;
       max[3] = 3;
       max[4] = 4;

       for (int i = 5;i<=length;++i){
           int maxTemp = 0;
           for(int j = 1;j<=i/2;j++){
               if(max[j]*max[i-j]>maxTemp){
                   maxTemp = max[j]*max[i-j];
               }
           }
           max[i] = maxTemp;
       }

       return max[length];
   }

    public static void main(String[] args) {
        System.out.println(getMax2(8));
    }

    /**
     * 动态规划 当长度大于5是 尽量分3
     * @param length
     * @return
     */
    public static int getMax2(int length){
        if(length == 2){
            return 1;
        }
        if(length == 3){
            return 2;
        }
        if(length == 4){
            return 4;
        }

        int result = 1;
        int tempLength = length;
        while (tempLength>4){
            result = 3*result;
            tempLength = tempLength-3;
        }
        return result*tempLength;

    }
}
