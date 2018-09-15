package 笔试.华为;

import java.util.HashMap;
import java.util.Scanner;

/**
 * @Author: lilinglin
 * @Description:
 * @Date: Created in 2018/9/15
 */
public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] chars = sc.nextLine().toCharArray();
        HashMap<Character,Integer> map = new HashMap(256);

        for (int i =0;i<chars.length;i++){
            Integer num = map.get(chars[i]);
            int nextNum;
            if(num==null){
                nextNum = 1;
            }else {
                nextNum = num+1;
            }
            map.put(chars[i],nextNum);
        }

        for (int i = chars.length-1;i>=0;i--){
            Integer num = map.get(chars[i]);
            if(num==1){
                System.out.println(chars[i]);
                return;
            }
        }
        System.out.println("NULL");
    }
}
