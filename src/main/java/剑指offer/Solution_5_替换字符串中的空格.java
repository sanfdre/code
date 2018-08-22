package 剑指offer;

/**
 * @Author: lilinglin
 * @Description:
 * @Date: Created in 2018/6/28
 */
public class Solution_5_替换字符串中的空格 {

    public static void main(String[] args) {
        String str = replaceSpace(new StringBuffer("hello world"));
        System.out.println(str);
    }
    public static String replaceSpace(StringBuffer str) {
        //获取空格数
        char[] chars = str.toString().toCharArray();
        int spaceNums = getSpaceNums(chars);

        char first  = '%';
        char second  = '2';
        char third  = '0';

        char[] newChars = new char[chars.length+2*spaceNums];
        int newCharsIndex = newChars.length-1;
        for(int i = chars.length-1;i>=0;i--){
            if(' '!=chars[i]){
                newChars[newCharsIndex] = chars[i];
                newCharsIndex--;
            }else {
                newChars[newCharsIndex] = third;
                newCharsIndex--;

                newChars[newCharsIndex] = second;
                newCharsIndex--;

                newChars[newCharsIndex] = first;
                newCharsIndex--;
            }
        }
        return String.valueOf(newChars);
    }

    public static int getSpaceNums(char[] chars){
        int nums = 0;
        Character character = new Character(' ');
        for (int i = 0;i<chars.length;i++){
            if(character.equals(chars[i])){
                nums++;
            }
        }
        return nums;
    }
}
