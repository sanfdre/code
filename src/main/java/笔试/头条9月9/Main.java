package 笔试.头条9月9;

import java.util.Scanner;

/**
 * @Author: lilinglina
 * @Description:
 * @Date: Created in 2018/9/9
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int[][] array = new int[m][m];
        for (int i = 0;i<m;i++){
            for (int j = 0;j<m;j++){
                array[i][j] = sc.nextInt();
            }
        }

        int result = 0;
        for (int i = 0;i<m;i++){
            for (int j = 0;j<m;j++){
                  if(array[i][j]==1){
                      getGroup(i,j,array,m);
                      result++;
                  }
            }
        }
        System.out.println(result);
    }

    public static void getGroup(int i,int j,int[][] array,int m){
        if(checkAddress(i,j,m)){
            if(array[i][j]==1){
                array[i][j] = -1;
                getGroup(i-1,j,array,m);
                getGroup(i+1,j,array,m);
                getGroup(i,j-1,array,m);
                getGroup(i,j+1,array,m);
                return;
            }else {
                array[i][j] = -1;
                return;
            }
        }else {
            return;
        }

    }

    public static boolean checkAddress(int x,int y,int m){
       return x>=0 && x<m && y>=0 && y<m;
    }
}
