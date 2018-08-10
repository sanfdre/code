package 笔试.阿里内推;

import java.util.Scanner;

/**
 * @Author: lilinglin
 * @Description:
 * @Date: Created in 2018/8/10
 */
public class NeiTui {
    private static int min = Integer.MAX_VALUE;
    private static final String visitedFlag = "true";
    private static final String zeroPoint = "0,0";
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String[] points = new String[n];
        for (int i = 0;i<n;i++){
            points[i] = sc.nextLine();
        }
        getMin(zeroPoint,points,0,0,n);
        System.out.println(min);
    }

    public static void getMin(String start,String[] points,int sum,int count,int n){
        if(count==n){
            sum = sum+getLength(start,zeroPoint);
            if(sum<min){
                min = sum;
            }
            return;
        }

        for (int i = 0;i<n;i++){
            if(!visitedFlag.equals(points[i])){
                sum+=getLength(start,points[i]);
                String temppoint = points[i];
                if(sum<min){
                    points[i] = visitedFlag;
                    getMin(temppoint,points,sum,++count,n);
                }
                points[i] = temppoint;
                count--;
                sum-=getLength(start,points[i]);
            }else {
                continue;
            }
        }
    }

    public static int getLength(String start,String end){
        return Math.abs(getXY(start,0)-getXY(end,0))+
                Math.abs(getXY(start,1)-getXY(end,1));
    }


    public static int getXY(String point,int type){
        String[] strs = point.split(",");
        int index;
        if(type==0){
            index=Integer.parseInt(strs[0]);
        }else {
            index=Integer.parseInt(strs[1]);
        }
        return index;
    }
}
