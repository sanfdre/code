package 笔试.京东;

        import java.util.ArrayList;
        import java.util.HashSet;
        import java.util.List;
        import java.util.Scanner;

/**
 * @Author: lilinglin
 * @Description:
 * @Date: Created in 2018/9/9
 */
public class Main {
//    static class Node{
//        private int value;
//        HashSet<Integer> set = new HashSet<>();
//        private boolean visited = false;
//
//        public boolean isVisited() {
//            return visited;
//        }
//
//        public void setVisited(boolean visited) {
//            this.visited = visited;
//        }
//
//        public int getValue() {
//            return value;
//        }
//
//        public void setValue(int value) {
//            this.value = value;
//        }
//
//        public HashSet<Integer> getSet() {
//            return set;
//        }
//
//        public void setSet(HashSet<Integer> set) {
//            this.set = set;
//        }
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        for (int i=0;i<a;i++){
//            int n = sc.nextInt();
//            Node[] nodes = new Node[n];
//            for (int j = 0;j<n;j++){
//                Node node = new Node();
//                nodes[j] = node;
//            }
//            int m = sc.nextInt();
//            for (int j=0;j<m;j++){
//                int p = sc.nextInt()-1;
//                int q = sc.nextInt()-1;
//                nodes[p].set.add(q);
//                nodes[q].set.add(p);
//            }
//            if(check(nodes)){
//                System.out.println("Yes");
//            }else {
//                System.out.println("No");
//            }
//        }
//    }
//
//    public static boolean check(Node[] nodes){
//        List<List<Node>> lists = new ArrayList<>();
//        for (int i =0;i<nodes.length;i++){
//            if(!nodes[i].visited){
//                List<Node> nodeList= new ArrayList<>();
//                lists.add(nodeList);
//                nodeList.add(nodes[i]);
//                for (int j =0;j<nodes.length;j++){
//                    if(!nodes[j].visited){
//                        if(!nodes[j].set.contains(nodes[i].value)){
//                            nodeList.add(nodes[j]);
//                        }
//                    }
//                }
//            }
//        }
//        return check2(lists);
//    }
//
//    public static boolean check2( List<List<Node>> lists){
//        if(lists.size()>0){
//            for (List list : lists){
//                if(list.size()>0){
//                    for (int i = 0;i<list.size();i++){
//                        for (int j = 0;j<list.size();j++){
//                            Node nodei = (Node) list.get(i);
//                            Node nodej = (Node) list.get(j);
//                            if(nodei.set.contains(nodej.value)) return false;
//                        }
//                    }
//                }
//            }
//        }
//
//        return true;
//    }
    static class Node{
        private long a;
        private long b;
        private long c;

        public long getA() {
            return a;
        }

        public void setA(long a) {
            this.a = a;
        }

        public long getB() {
            return b;
        }

        public void setB(long b) {
            this.b = b;
        }

        public long getC() {
            return c;
        }

        public void setC(long c) {
            this.c = c;
        }

        public boolean compare(Node node){
            if(a<node.a&&b<node.b&&c<node.c){
                return false;
            }else {
                return true;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Node[] nodes = new Node[n];
        long a,b,c;
        for (int i = 0;i<n;i++){
           a = sc.nextLong();
           b = sc.nextLong();
           c = sc.nextLong();

           Node node = new Node();
           node.setA(a);
           node.setB(b);
           node.setC(c);
           nodes[i] = node;
        }

        int result = 0;

        for (int i = 0;i<n;i++){
            for (int j = 0;j<n;j++){
                if(!nodes[i].compare(nodes[j])){
                    result++;
                    break;
                }
            }
        }
        System.out.println(result);
    }
}

//
///**
// * @Author: lilinglin
// * @Description:
// * @Date: Created in 2018/9/9
// */
//public class Main {
//    public static void main(String[] args) {
//        System.out.println("Yes");
//        System.out.println("No");
//    }
//}