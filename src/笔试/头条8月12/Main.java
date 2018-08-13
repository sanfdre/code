package 笔试.头条8月12;

import java.util.*;

/**
 * @Author: lilinglin
 * @Description:
 * @Date: Created in 2018/8/12
 */
public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        TreeSet<Words> wordsHashSet = new TreeSet<>();
//        Words words;
//        String line ;
//        String[] lines;
//        String[] temp;
//        int n =Integer.parseInt(sc.nextLine());
//        for (int i = 0;i<n;i++){
//            line = sc.nextLine();
//            lines = line.split(";");
//            for (int j = 0;j<lines.length;j++){
//                words = new Words();
//                temp = lines[j].split(",");
//                words.setStart(Integer.parseInt(temp[0]));
//                words.setEnd(Integer.parseInt(temp[1]));
//
//                add(words,wordsHashSet);
//            }
//        }
//        StringBuffer buffer = new StringBuffer();
//        for (Words words1 : wordsHashSet){
//            buffer.append(words1.getStart()+","+words1.getEnd()+";");
//        }
//        buffer.deleteCharAt(buffer.length()-1);
//        System.out.println(buffer);
//    }
//
//    public static void add(Words words,TreeSet<Words> wordsHashSet){
//        if (wordsHashSet.contains(words)){
//            Words words1 = wordsHashSet.ceiling(words);
//            int startIndex = words.getStart()<words1.getStart()?words.getStart():words1.getStart();
//            int endIndex = words.getEnd()>words1.getEnd()?words.getEnd():words1.getEnd();
//            words.setStart(startIndex);
//            words.setEnd(endIndex);
//            wordsHashSet.remove(words1);
//            add(words,wordsHashSet);
//        }else {
//            wordsHashSet.add(words);
//        }
//    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Cards[] cards = new Cards[n];

        int sum = 0;

        for (int i = 0;i<cards.length;i++){
            Cards card = new Cards();
            card.setX(sc.nextInt());
            card.setY(sc.nextInt());
            cards[i] = card;
            sum+=card.getY();
        }

        Arrays.sort(cards);



//        System.out.println(cards);
        int end = cards.length-1;
        while (true){

        }

    }




}

class Cards implements Comparable{
    private int x;
    private int y;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public int compareTo(Object o) {
        Cards cards = (Cards)o;
        if (this.getY() < cards.getY()) {
            return -1;
        }else if(this.getY() == cards.getY()){
            return 0;
        }else {
            return 1;
        }
    }
}



class Words implements Comparable {
    private int start;
    private int end;

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getEnd() {
        return end;
    }

    public void setEnd(int end) {
        this.end = end;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Words words = (Words) o;
        return ((words.end >= this.end && words.start <= this.end)
                || (this.end >= words.end && this.start <= words.end));
    }

    @Override
    public int hashCode() {

        return 1;
    }

    @Override
    public int compareTo(Object o) {
        Words words = (Words) o;

        if(((words.end >= this.end && words.start <= this.end)
                || (this.end >= words.end && this.start <= words.end))){
            return 0;
        }
        if (this.getStart() < words.getStart()) {
            return -1;
        }else {
            return 1;
        }
    }
}