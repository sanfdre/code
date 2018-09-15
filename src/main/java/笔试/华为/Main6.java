package 笔试.华为;

import java.util.Scanner;

/**
 * Created by dp on 2018/9/15.
 */
public class Main6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] strs = str.split("\\s+");

        String res = "";
        for(int i=0;i<strs.length;i++){
            if(i == strs.length-1){
                res+=reverse(strs[i]);
            }else
                res = res+reverse(strs[i])+" ";

        }
        System.out.println(res);
    }
    public static String reverse(String string){
        return new StringBuilder(string).reverse().toString();
    }
}
