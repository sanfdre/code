package 剑指offer;

/**
 * @Author: lilinglin
 * @Description:
 * @Date: Created in 2018/8/7
 */
public class Solution_16_数值的整数次放 {
    public static double power(double base,int n) {

        if(base==0.0 && n<0){
            return 0;
        }

        double result;
        if(n<0){
            result = getPower(base,-1*n);
            result = 1.0/result;
        }else {
            result = getPower(base,n);
        }

        return result;
    }

    public static double getPower(double base,int n){
        if(n==0){
            return 1;
        }
        if(n==1){
            return base;
        }
        double result = getPower(base,n>>1);
        result*=result;
        if((n&1)==1){
            result*=base;
        }
        return result;
    }
}
