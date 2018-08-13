package 笔试.网易;

import java.util.Scanner;

/**
 * @Author: lilinglin
 * @Description:
 * @Date: Created in 2018/8/11
 */
public class NetBase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line  = sc.nextLine();
        String[] linses = line.split(" ");
        int n = Integer.parseInt(linses[0]);
        int k = Integer.parseInt(linses[1]);

        line = sc.nextLine();
        linses = line.split(" ");
        int[] cores = new int[linses.length];
        for (int i=0;i<cores.length;i++){
            cores[i] = Integer.parseInt(linses[i]);
        }

        line = sc.nextLine();
        linses = line.split(" ");
        int result = 0;
        for (int i = 0;i<n;i++){
            if(linses[i].equals("1")){
                result+=cores[i];
            }else {
                continue;
            }
        }

        int sum =0;
        int resul1 = sum;


        for (int i = 0;i<n;i++){
            if(!linses[i].equals("1")){
                int temp = sum;
                for (int j=0;j<k;j++){
                    if((j+i)<n){
                        if(linses[j+i].equals("0")){
                            temp += cores[j+i];
                        }
                    }else {
                        break;
                    }
                }
                if(temp>sum){
                    resul1 = temp;
                }
            }else {
                result+=cores[i];
                continue;
            }
        }

        System.out.println(result+resul1);


    }

//
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = Integer.parseInt(sc.nextLine());
//
//        String line = sc.nextLine();
//        String[] lines = line.split(" ");
//        int[] apples = new int[lines.length];
//        int[] sums = new int[n+2];
//        sums[0] = 0;
//
//
//        for (int i = 0;i<apples.length;i++){
//            apples[i] = Integer.parseInt(lines[i]);
//            sums[i+1] = apples[i]+sums[i];
//        }
//
//        sums[n+1] = Integer.MAX_VALUE;
//
//        int m = Integer.parseInt(sc.nextLine());
//        line = sc.nextLine();
//        lines = line.split(" ");
//
//        for (int i=0;i<lines.length;i++){
//            int apple = Integer.parseInt(lines[i]);
//            int left = 0;
//            int right = sums.length-1;
//
//            int middle = (left+right)/2;
//
//            while (true){
//                if((right-left)==1){
//                    if(apple>sums[left]){
//                        middle = right;
//                    }else {
//                        middle = left;
//                    }
//                    break;
//                }
//                if(sums[middle]==apple){
//                    break;
//                }else if(sums[middle]<apple){
//                    left = middle;
//                    middle = (left+right)/2;
//                }else {
//                    right = middle;
//                    middle = (left+right)/2;
//                }
//            }
//            System.out.println(middle);
//        }
//
//    }


}
