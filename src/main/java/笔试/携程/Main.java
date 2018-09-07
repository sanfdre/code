package 笔试.携程;

import java.util.*;

/**
 * @Author: lilinglin
 * @Description:
 * @Date: Created in 2018/9/4
 */
public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        long a = sc.nextLong();
//        int result = 0;
//        while (a!=0){
////            if(((a&1)!=0)){
////                result++;
////            }
////            a = a>>1;
//            result++;
//            a = a&(a-1);
//        }
//        System.out.println(result);
//    }

    public static void main(String[] args) {

        Cache lru = new Cache(true);
        Scanner sc = new Scanner(System.in);
        String number = sc.nextLine();
        lru.setSize(Integer.parseInt(number));

        String line;
        String[] strings;
        String lineTemp;
        List<String> list = new ArrayList<>();
        while (sc.hasNextLine()){
            line = sc.nextLine();
            lineTemp = line.replaceAll(" ","");
            if(line.isEmpty() || lineTemp.isEmpty()){
                break;
            }
            strings = line.split(" ");
            if(strings.length==2){
                String a =(String) lru.get(strings[1]);
                if(a ==null){
                  list.add("-1");
                }else {
                    list.add(a);
                }
            }else {
                lru.put(strings[1],strings[2]);
            }
        }
        for (String s : list){
            System.out.println(s);
        }
    }

   static class Cache extends LinkedHashMap{
        private int size1;

        public Cache(boolean accessOrder) {
            super(16, 0.75f, accessOrder);
        }

        protected boolean removeEldestEntry(Map.Entry eldest) {
            if(size() > size1){
                return true;
            }
            return false;
        }

        public void setSize(int size){
            this.size1= size;
        }
    }
}
