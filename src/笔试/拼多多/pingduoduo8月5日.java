package 笔试.拼多多;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

/**
 * @Author: lilinglin
 * @Description:
 * @Date: Created in 2018/8/5
 */
public class pingduoduo8月5日 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String line = sc.nextLine();
//        char[] chars = line.toCharArray();
//        int length = chars.length;
//        int k = length/4+1;
//        int size = k-1;
//        char[][] array = new char[k][k];
//        for(int i = 0;i<size;i++){
//            array[0][i] = chars[i];
//        }
//        for (int i = 0;i<size;i++){
//            array[i][k-1] = chars[i+size];
//        }
//        for (int i = 0;i<size;i++){
//            array[k-1][k-1-i] = chars[i+2*size];
//        }
//        for(int i = 0;i<size;i++){
//            array[k-1-i][0] = chars[i+3*size];
//        }
//        for(int i = 0;i<k;i++){
//            for (int j = 0;j<k;j++){
//                if(i == 0 || i==k-1){
//                    System.out.printf(String.valueOf(array[i][j]));
//                }else {
//                    if(j == 0 || j==k-1){
//                        System.out.printf(String.valueOf(array[i][j]));
//                    }else {
//                        System.out.printf(String.valueOf(" "));
//                    }
//                }
//            }
//            System.out.println();
//        }
//    }

//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String line = sc.nextLine();
//        String[] lineChar = line.split(" ");
//        int n = Integer.valueOf(lineChar[0]);
//        int taregt = Integer.parseInt(lineChar[1]);
//        Map<Integer,String[]> map = new HashMap();
//        for (int i = 0;i<n;i++){
//            line = sc.nextLine();
//
//            map.put(i,line.split(" "));
//        }
//
//        String[] chars1 = map.get(taregt);
//        HashSet set = new HashSet();
//        for (int i = 0;i<chars1.length;i++){
//            set.add(chars1[i]);
//        }
//
//        int max = 0;
//        int result = -1;
//
//        for (int i = 0;i<n;i++){
//            if(i!=taregt){
//                String[] chars2 = map.get(i);
//                int same = getSame(set,chars2);
//                if(same>max){
//                    result = i;
//                    max = same;
//                }
//            }
//        }
//        System.out.println(result);
//    }
//     public static int getSame(HashSet set,String[] chars2){
//         int result = 0;
//         for (int i = 0;i<chars2.length;i++){
//             if(set.contains(chars2[i])){
//                 result++;
//             }
//         }
//         return result;
//     }


}
