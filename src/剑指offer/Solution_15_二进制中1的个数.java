package 剑指offer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @Author: lilinglin
 * @Description:
 * @Date: Created in 2018/6/17
 */
public class Solution_15_二进制中1的个数 {
    public static int solution1(int n){
        int temp = 1;
        int result = 0;
        while (temp!=0){
            if((temp&n)!=0){
                result++;
            }
            temp = temp<<1;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(solution2(9));
    }

    public static int solution2(int n){
        int result = 0;
        while (n!=0){
            result++;
            n = n&(n-1);
        }
        return result;
    }
}
