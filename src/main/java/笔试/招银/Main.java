package 笔试.招银;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @Author: lilinglin
 * @Description:
 * @Date: Created in 2018/9/8
 */
public class Main {

//    public static int fun(int x){
//        if(x==0 || x==1){
//            return x+1;
//        }
//        return fun(x-1)+fun(x-2);
//    }
//
//    public static void test3(){
//        System.out.println(fun(10));
//    }
//
//    public static void main(String[] args) {
//        test3();
//    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int n,m;
        List<Integer> list = new ArrayList();
        for (int i = 0;i<t;i++){
            n = sc.nextInt();
            m = sc.nextInt();
            list.add(check(n,m));
        }
        for (Integer result : list){
            System.out.println(result);
        }
    }

    public static int check(int n,int m) {
        int result = 0;
        if ((n - 2) >= 0 && (m - 2) >= 0) {
            result += (n - 2) * (m - 2);
        }

        result += (m - 2)>0?m-2:0;
        result += check1(0, 0, n, m);

        if ((n - 1) != 0) {
            result += (m - 2)>0?m-2:0;
            result+=check1(n-1,0,n,m);
        }

        result += (n - 2)>0?n - 2:0;
        result += check1(0, m-1, n, m);

        if ((m - 1) != 0) {
            result += (n - 2)>0?n - 2:0;
            result += check1(n-1, m-1, n, m);
        }
            return result;
    }

        public static int check1( int a, int b, int n, int m){
            int count = 1;
            if (checkIndex(a - 1, b - 1, n, m)) count++;
            if (checkIndex(a - 1, b, n, m)) count++;
            if (checkIndex(a - 1, b + 1, n, m)) count++;
            if (checkIndex(a, b - 1, n, m)) count++;
            if (checkIndex(a, b + 1, n, m)) count++;
            if (checkIndex(a + 1, b - 1, n, m)) count++;
            if (checkIndex(a + 1, b, n, m)) count++;
            if (checkIndex(a + 1, b + 1, n, m)) count++;
            if (count % 2 != 0) {
                return 1;
            } else {
                return 0;
            }
        }

        public static boolean checkIndex ( int x, int y, int n, int m){
            if (x >= 0 && x <= n - 1 && y >= 0 && y <= m - 1) {
                return true;
            } else {
                return false;
            }
        }



    }

