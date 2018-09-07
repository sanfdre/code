package 笔试.美团;

import java.util.*;

/**
 * @Author: lilinglin
 * @Description:
 * @Date: Created in 2018/9/6
 */
public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int k = sc.nextInt();
//        int t = sc.nextInt();
//
//        int result = 0;
//        int left = 0;
//        int right = k+left-1;
//        int[] array = new int[n];
//        HashMap map = new HashMap();
//        for (int i = 0;i<n;i++){
//            array[i] = sc.nextInt();
//            if(i>=right){
//                while (right<array.length){
//                    int leftTemp = left;
//                    int rightTemp = right;
//                    map.clear();
//                    for (int j = leftTemp;j<=rightTemp;j++){
//                        int count = map.get(array[j])==null?0:(Integer) map.get(array[j]);
//                        count++;
//                        if (count>=t){
//                            result++;
//                            break;
//                        }
//                        map.put(array[j],count);
//                    }
//                    left++;
//                    right++;
//                }
//
//            }
//        }
//        System.out.println(result);
//    }

    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int t= sc.nextInt();

        List<Integer> list = new ArrayList<>(n);
        int result = 0;
        int left = 0;
        int right = k+left-1;

        for (int i=0;i<n;i++){
            list.add(sc.nextInt());
            if(i>=right){
                while(right<n){
                    HashMap<Integer,Integer> hashMap = new HashMap<>();
                    for(int j=left;j<=right;j++){
                        int count;
                        Integer x = (Integer) hashMap.get(list.get(j));
                        if(x==null){
                            count = 0;
                        }else {
                            count = x;
                        }
                        count++;
                        if (count>=t){
                            result++;
                            break;

                        }
                        hashMap.put(list.get(j),count);
                    }
                    left++;
                    right++;
                }
            }
        }




        System.out.println(result);

    }
}



/**

 * Created by tyr on 2018/9/6.

 */
//
//public class Test {
//
//    public static void main(String[] args){
//
//        Scanner sc=new Scanner(System.in);
//        int n = sc.nextInt();
//        int k = sc.nextInt();
//        int t= sc.nextInt();
//
//        List<Integer> list = new ArrayList<>(n);
//
//        for (int i=0;i<n;i++){
//            list.add(sc.nextInt());
//        }
//
//
//        int result = 0;
//        int left = 0;
//        int right = k+left-1;
//        while(right<n){
//            HashMap<Integer,Integer> hashMap = new HashMap<>();
//            for(int i=left;i<=right;i++){
//                int count;
//                Integer x = (Integer) hashMap.get(list.get(i));
//               if(x==null){
//                    count = 0;
//               }else {
//                    count = x;
//               }
//                count++;
//                if (count>=t){
//                    result++;
//                    break;
//
//                }
//                hashMap.put(list.get(i),count);
//            }
//            left++;
//            right++;
//        }
//        System.out.println(result);
//
//    }
//
//}

