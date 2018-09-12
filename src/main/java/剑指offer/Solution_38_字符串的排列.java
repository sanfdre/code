package 剑指offer;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

/**
 * @Author: lilinglin
 * @Description:
 * @Date: Created in 2018/6/27
 */
public class Solution_38_字符串的排列 {
    public static void main(String[] args) {
        Solution_38_字符串的排列 ee = new Solution_38_字符串的排列();
        ee.Permutation("");
    }
    public ArrayList<String> Permutation(String str) {

        ArrayList<String> list = new ArrayList<>();
        if(str.length()<=0){
            return list;
        }
        char[] chars = str.toCharArray();
        TreeSet<String> set = new TreeSet();
        PermutationChars(chars,set,0);
        for (String temp : set){
            System.out.println(temp);
            list.add(temp);
        }
        return list;
    }

    public void PermutationChars(char[] chars, TreeSet<String> set, int index){
        if(index==chars.length){
            set.add(String.valueOf(chars));
            return;
        }
        for (int i=index;i<chars.length;i++){
            change(chars,index,i);
            index++;
            PermutationChars(chars,set,index);
            index--;
            change(chars,index,i);
        }
    }

    public void change(char[] chars,int start,int end){
        char temp = chars[start];
        chars[start] = chars[end];
        chars[end] = temp;
    }
}
