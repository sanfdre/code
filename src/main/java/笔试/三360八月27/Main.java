//package 笔试.三360八月27;
//
//import java.util.HashSet;
//import java.util.Scanner;
//
///**
// * @Author: lilinglin
// * @Description:
// * @Date: Created in 2018/8/27
// */
//public class Main {
////    public static void main(String[] args) {
////        Scanner sc  = new Scanner(System.in);
////
////        int n = sc.nextInt();
////
////        int xMin = Integer.MAX_VALUE;
////        int yMin = Integer.MAX_VALUE;
////        int xMax = Integer.MIN_VALUE;
////        int yMax = Integer.MIN_VALUE;
////
////        while (n>0){
////            n--;
////            int x = sc.nextInt();
////            int y = sc.nextInt();
////            if(x<xMin) xMin = x;
////            if(x>xMax) xMax = x;
////            if(y<yMin) yMin = y;
////            if(y>yMax) yMax = y;
////        }
////
////        int maxX = Math.abs(xMax-xMin);
////        int maxY = Math.abs( yMax-yMin);
////        int max = (maxX>maxY?maxX:maxY);
////        System.out.println(max*max);
////    }
//
////    public static void main(String[] args) {
////        Scanner sc = new Scanner(System.in);
////        int n = sc.nextInt();
////        int m = sc.nextInt();
////        int[] see = new int[n];
////        for (int i = 0;i<n;i++){
////            see[i] = sc.nextInt();
////        }
////        HashSet set = new HashSet();
////
////        int q = sc.nextInt();
////        for (int i = 0;i<q;i++){
////            set.clear();
////            int l = sc.nextInt()-1;
////            int r = sc.nextInt()-1;
////            for (int j = l;j<=r;j++){
////                set.add(see[j]);
////            }
////            System.out.println(set.size());
////        }
////    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        Node[] a = new Node[n];
//        for (int i = 0 ;i<n;i++){
//            Node node = new Node();
//            node.setIndex(i);
//            node.setValue(sc.nextInt());
//            a[i] = node;
//        }
//
//        Node[] b = new Node[n];
//        for (int i = 0 ;i<n;i++){
//            Node node = new Node();
//            node.setIndex(i);
//            node.setValue(sc.nextInt());
//            b[i] = node;
//        }
//
//        int result;
//        for(int i = n;i>0;i--){
//            int end = i-1;
//            int start = 0;
//            while (end<=n-1){
//                boolean falg = true;
//                for (int j = start;j<=end;j++){
//                    for (int q = j+1;q<=end;q++){
//                        if(a[j].getIndex()>a[q].getIndex()){
//                            if(b[j].getIndex()>b[q].getIndex()){
//                                falg = false;
//                                break;
//                            }
//                        }
//                        if(a[q].getIndex()>a[j].getIndex()){
//                            if(b[q].getIndex()>b[j].getIndex()){
//                                falg = false;
//                                break;
//                            }
//                        }
//                    }
//                }
//                if(falg){
//                    result = i;
//                    System.out.println(result);
//                    return;
//                }
//                start+=1;
//                end+=1;
//            }
//        }
//    }
//}
//
//class Node implements Comparable{
//    int value;
//    int index;
//
//    public int getValue() {
//        return value;
//    }
//
//    public void setValue(int value) {
//        this.value = value;
//    }
//
//    public int getIndex() {
//        return index;
//    }
//
//    public void setIndex(int index) {
//        this.index = index;
//    }
//
//    @Override
//    public int compareTo(Object o) {
//        Node node = (Node) o;
//        if(index ==  ((Node) o).getIndex()){
//            return 0;
//        }else if(index<node.getIndex()){
//            return -1;
//        }else {
//            return 1;
//        }
//    }
//}



