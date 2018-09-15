package 笔试.华为;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 * @Author: lilinglin
 * @Description:
 * @Date: Created in 2018/9/15
 */
public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigDecimal num1 = new BigDecimal(sc.nextLine());
        BigDecimal num2 = new BigDecimal(sc.nextLine());
        System.out.println(num1.multiply(num2).toString());
    }
}
