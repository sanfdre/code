//package 笔试.贝壳找房8月16;
//
//import java.util.Arrays;
//import java.util.Scanner;
//
///**
// * @Author: lilinglin
// * @Description:
// * @Date: Created in 2018/8/18
// */
//public class beike {
////        道路修建
////    时间限制：C/C++语言 1000MS；其他语言 3000MS
////    内存限制：C/C++语言 65536KB；其他语言 589824KB
////    题目描述：
////    山区里有N个村庄，第i个村庄的海拔高度为Ai。现在要在村庄之间修建道路，使得从每个村庄出发，都能到达其它所有村庄。在第i和第j个村庄之间修建道路的费用取决于海拔较高的村庄的高度，即费用为max{Ai，Aj}，那么修建道路的总费用最少是多少？
////
////    输入
////    第一行包含一个整数N，2≤N≤105。
////
////    第二行包含N个空格隔开的整数A1到AN，0≤Ai≤104。
////
////    输出
////    输出修建道路的最小费用。
////
////
////    样例输入
////      5
////      4 1 8 2 5
////    样例输出
////    19
////    private static int min = Integer.MAX_VALUE;
////
////    public static void main(String[] args) {
////        Scanner sc = new Scanner(System.in);
////        int n = sc.nextInt();
////        int[] arrays = new int[n];
////        for (int i = 0;i<n;i++){
////            arrays[i] = sc.nextInt();
////        }
//////        getMin(arrays,0,0);
////        Arrays.sort(arrays);
////        int sum = 0;
////        for (int i=0;i<arrays.length-1;i++){
////            sum+=(arrays[i+1]);
////        }
////        System.out.println(sum);
////    }
////
////    public static void getMin(int[] array,int sum,int pre){
////        boolean overFlag = true;
////        for (int i = 0;i<array.length;i++){
////            if(array[i]>=0){
////                overFlag = false;
////                int length = getMax(pre,array[i]);
////                sum+=length;
//////                if(sum>min){
//////                    sum-=length;
//////                    continue;
//////                }
////                int temp = array[i];
////                array[i] = -1;
////                getMin(array,sum,temp);
////                //恢复现场
////                sum-=length;
////                array[i] = temp;
////            }
////        }
////        if(overFlag){
////            System.out.println(sum);
////            if(sum<min){
////                min = sum;
////            }
////        }
////    }
////
////    public static int getMax(int i,int j){
////        return i>j?i:j;
////    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        Node[] nodes = new Node[sc.nextInt()];
//        for(int i =0;i<nodes.length;i++){
//            Node node = new Node();
//            node.setStart(sc.nextInt());
//            node.setEnd(sc.nextInt());
//        }
//        Arrays.sort(nodes);
//        int min = 1;
//        int max = 1;
//        boolean one = true;
//        boolean two = true;
//        boolean three = true;
//        int result;
//        for (int i=0;i<nodes.length;i++){
//            if(nodes[i].getStart()<min){
//                one = false;
//                if(check1(nodes,i+1,min,max)){
//                    result = i;
//                    System.out.println(1);
//                    System.out.println(result);
//                    return;
//                }
//
//                Node pre = nodes[i-1];
//                if(pre.getEnd()==max){
//                    max = nodes[i-2].getEnd();
//                }
//
//                if(check1(nodes,i,min,max)){
//                    result = i;
//                    System.out.println(1);
//                    System.out.println(result);
//                    return;
//                }
//
//
//            }else {
//                if(nodes[i].getEnd()>max){
//                    max = nodes[i].getEnd();
//                }
//            }
//        }
//
////        if(one){
////            System.out.println(nodes.length);
////            for(int i =0)
////        }
//    }
//
//    public static boolean check1(Node[] nodes,int start,int min,int max){
//        for(int i=start;i<nodes.length;i++){
//            if(nodes[i].getStart()<min){
//                return false;
//            }else {
//                if(nodes[i].getEnd()>max){
//                    max = nodes[i].getEnd();
//                }
//            }
//        }
//        return true;
//    }
//
//
//}
//
//class Node implements Comparable{
//    Integer start;
//    Integer end;
//
//    public Integer getStart() {
//        return start;
//    }
//
//    public void setStart(Integer start) {
//        this.start = start;
//    }
//
//    public Integer getEnd() {
//        return end;
//    }
//
//    public void setEnd(Integer end) {
//        this.end = end;
//    }
//
//    @Override
//    public int compareTo(Object o) {
//        return start.compareTo(((Node)o).start);
//    }
//}
