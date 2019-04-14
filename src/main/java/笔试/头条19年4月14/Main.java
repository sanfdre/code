package 笔试.头条19年4月14;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @Author: lilinglina
 * @Description:
 * @Date: Created in 2018/9/9
 */
public class Main {
    private static int pmNum = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        for (int i=0;i<10;i++){
           if(sc.hasNextLine()){
               String str = sc.nextLine();
               if(str!=null && !str.equals("")){
                   list.add(str);
               }else {
                   sc.close();
                   break;
               }
           }else {
               break;
           }
        }

        int n = list.get(0).length();
        int m = list.size();

        int[][] data = new int[m][n];
        boolean[][] flag = new boolean[m][n];

        for (int i = 0;i<list.size();i++){
            String[] strs = list.get(i).split(" ");
            for (int j = 0;j<strs.length;j++){
                data[i][j] = Integer.parseInt(strs[j]);
                if(data[i][j]==1){
                    pmNum++;
                }
            }
        }

        int result = 0;
        int tmp = -1;
        while (pmNum>0 && pmNum!=tmp){
            tmp = pmNum;
            setFlag(data,flag);
            for (int i = 0;i<data.length;i++){
                for (int j = 0;j<data[0].length;j++){
                    if(flag[i][j]==true){
                        changeCoder(data,flag,i,j);
                    }
                }
            }
            result++;
        }

        if(pmNum==0){
            System.out.println(result);
        }else {
            System.out.println(-1);
        }
    }

    public static void changeCoder(int[][] data,boolean[][] flag,int m,int n){
        int newM;
        int newN;

        setFlag(data,flag);
        newM = m-1;
        newN = n;
        if(checkIndex(newM,newN,data)){
            changeCoderDo(data,flag,newM,newN);
        }

        newM = m+1;
        newN = n;
        if(checkIndex(newM,newN,data)){
            changeCoderDo(data,flag,newM,newN);
        }

        newM = m;
        newN = n-1;
        if(checkIndex(newM,newN,data)){
            changeCoderDo(data,flag,newM,newN);
        }

        newM = m;
        newN = n+1;
        if(checkIndex(newM,newN,data)){
            changeCoderDo(data,flag,newM,newN);
        }
    }

    public static void changeCoderDo(int[][] data,boolean[][] flag,int m,int n){
        if(data[m][n]==1){
            data[m][n] =2;
            flag[m][n] = false;
            pmNum--;
        }
    }

    public static void setFlag(int[][] data,boolean[][] flag){
        for (int i = 0;i<data.length;i++){
            for (int j = 0;j<data[0].length;j++){
                if(data[i][j]==2){
                    flag[i][j] = true;
                }else {
                    flag[i][j] = false;
                }
            }
        }
    }

    public static boolean checkIndex(int m,int n,int[][] data){
        if(m<0 || m>=data.length) return false;
        if(n<0 || n>=data[0].length) return false;
        return true;
    }
}
