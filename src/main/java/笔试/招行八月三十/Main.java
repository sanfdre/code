package 笔试.招行八月三十;

import java.util.Scanner;

/**
 * @Author: lilinglin
 * @Description:
 * @Date: Created in 2018/8/30
 */
public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String line  = sc.nextLine();
//        char[] chars = line.toCharArray();
//
//        int result1 = 0;
//        char[] chars1 = chars.clone();
//        for(int i = 0;i<chars1.length;i++){
//            if('D'==(chars1[i])){
//                continue;
//            }
//            int temp = i;
//            while ((temp-1)>=0 && 'D'==(chars1[temp-1])){
//                chars1[temp-1] = 'C';
//                chars1[temp] = 'D';
//                temp--;
//                result1++;
//            }
//        }
//
//        int result2 = 0;
//        char[] chars2 = chars.clone();
//        for(int i = 0;i<chars2.length;i++){
//            if('C'==(chars2[i])){
//                continue;
//            }
//            int temp = i;
//            while ((temp-1)>=0 &&'C'==(chars2[temp-1])){
//                chars2[temp-1] = 'D';
//                chars2[temp] = 'C';
//                temp--;
//                result2++;
//            }
//        }
//
//        System.out.println(result1<result2?result1:result2);
//    }

//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String line  = sc.nextLine();
//        String[] strings = line.split(" ");
//        int[] numbers = new int[strings.length];
//        for (int i = 0;i<numbers.length;i++){
//            numbers[i] = Integer.parseInt(strings[i]);
//        }
//
//        int max = Integer.MIN_VALUE;
//        for (int i = 0;i<numbers.length;i++){
//           for (int j = i+1;j<numbers.length;j++){
//               if(numbers[j]>=numbers[i]){
//                   max = (numbers[j]-numbers[i])>max?(numbers[j]-numbers[i]):max;
//               }
//           }
//        }
//        if(max<=0){
//            System.out.println(0);
//        }else {
//            System.out.println(max);
//        }
//    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line  = sc.nextLine();
        String[] strings = line.split(" ");
        int[] numbers = new int[strings.length];
        int sum = 0;
        for (int i = 0;i<numbers.length;i++){
            numbers[i] = Integer.parseInt(strings[i]);
            sum+=numbers[i];
        }

        int h = sc.nextInt();

        int min = sum/h-1;
        while (true){
            int temp = h;
            for (int i = 0;i<numbers.length;i++){
                int time = (numbers[i]/min);
                temp = temp-(numbers[i]%min==0?time:time+1);
            }
            if(temp>=0){
                System.out.println(min);
                return;
            }
            min++;
        }

    }


}
