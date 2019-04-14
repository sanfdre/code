package 笔试.头条19年4月14;



import java.util.Scanner;

/**
 * @Author: lilinglin
 * @Description:
 * @Date: Created in 2018/9/9
 */
public class Main1 {
    private static int min = Integer.MAX_VALUE;
    private static int tmp = 0;
    private static int cityNum ;
    private static int begin ;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        cityNum = n;
        int[][] data = new int[n][n];
        for (int i=0;i<n;i++){
            for (int j = 0;j<n;j++){
                data[i][j] = sc.nextInt();
            }
        }

        boolean[] access = new boolean[n];
        int startCity;


        for (int i = 0;i<access.length;i++){
            startCity = i;
            begin = i;
            acess(data,access,startCity);
            tmp = 0;
            cityNum = n;
            access = new boolean[n];
        }

        System.out.println(min);
    }

    public static void acess(int[][] data,boolean[] access,int startCity){
        if(cityNum<=1){
            tmp +=data[startCity][begin];
            if(tmp<min){
                min = tmp;
            }
            return;
        }else {
            for (int i = 0;i<access.length;i++){
                if(begin!=i){
                    if(access[i]==false){
                        int cost = data[startCity][i];
                        tmp+=cost;
                        access[i] = true;
                        int pre = startCity;
                        startCity = i;
                        cityNum--;
                        acess(data,access,startCity);
                        tmp-=cost;
                        access[i] = false;
                        startCity = pre;
                        cityNum++;
                    }
                }
            }
        }
    }
}



