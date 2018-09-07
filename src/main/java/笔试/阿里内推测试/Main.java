//package 笔试.阿里内推测试;
//
//import java.util.Scanner;
//
///**
// * @Author: lilinglin
// * @Description:
// * @Date: Created in 2018/9/7
// */
//public class Main {
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] array = new int[n];
//        for (int i =0;i<n;i++){
//            array[i] = sc.nextInt();
//        }
//        int segementNum = n/3;
//        for(int i = 1;i<=segementNum;i++){
//
//        }
//    }
//
//    public void check(int[] array,boolean[] state,int maxLength){
//        for (int i = 3;i<=maxLength;i++){
//            int[] tempArray = new int[i];
//
//        }
//    }
//
//    public int[] getArray(int[] array,boolean[] state,int indeint num){
//       if(num==0){
//           return null;
//       }
//
//        for (int i = 0;i<array.length;i++){
//
//        }
//    }
//
//
//
//    public boolean checkArray(int[] array){
//        int d = 0;
//        float n = 1f;
//        boolean flagD = true;
//        boolean flagN = true;
//        for (int i = 0;i<array.length-1;i++){
//            if(d==0 ){
//                d = array[i+1]-array[i];
//            }else {
//                if(  d == array[i+1]-array[i]){
//                    continue;
//                }else {
//                    flagD = false;
//
//                }
//            }
//
//            if(n==1f){
//                n = (float) array[i+1]/(float) array[i];
//            }else {
//                if(  n == (float) array[i+1]/(float) array[i]){
//                    continue;
//                }else {
//                    flagN = false;
//                }
//            }
//        }
//
//        return flagD||flagN;
//    }
//}
