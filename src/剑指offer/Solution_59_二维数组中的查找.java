package 剑指offer;

/**
 * @Author: lilinglin
 * @Description:
 * @Date: Created in 2018/6/27
 */
public class Solution_59_二维数组中的查找 {
    public boolean Find(int target, int [][] array) {
        int row = array.length-1;
        int cow = 0;
        while(row>=0&&cow<=array[0].length-1){
            if(array[row][cow]>target){
                row = row - 1;
            }else if(array[row][cow]<target){
                cow = cow + 1;
            }else{
                return true;
            }
        }
        return false;
    }
}
