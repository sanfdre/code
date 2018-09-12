package 笔试.百度;// IMPORT LIBRARY PACKAGES NEEDED BY YOUR PROGRAM
//// SOME CLASSES WITHIN A PACKAGE MAY BE RESTRICTED
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Collections;
//import java.util.List;
//// DEFINE ANY CLASS AND METHOD NEEDED
//// CLASS BEGINS, THIS CLASS IS REQUIRED
//public class Solution
//{
//    public static void main(String[] args) {
//
//    }
//    // METHOD SIGNATURE BEGINS, THIS METHOD IS REQUIRED
//    List<Integer> findCommonElements(int numCustomer, int numProduct,
//                                     List<List<Integer> > productList)
//    {
//        List<Integer> list  = new ArrayList<>();
//        List<Integer> first = productList.get(0);
//        if(numCustomer==1){
//             Collections.sort(first);
//            return first;
//        }
//
//        for (Integer id : first){
//            boolean outFlag = true;
//            for (List<Integer> temp : productList){
//                boolean flag = false;
//                for (Integer tempId : temp){
//                    if(tempId==id){
//                        flag=true;
//                        break;
//                    }
//                }
//                if(!flag){
//                    outFlag = false;
//                    break;
//                }
//            }
//            if(outFlag){
//                list.add(id);
//            }
//        }
//        Collections.sort(list);
//        return list;
//    }
//}

import java.util.List;

// IMPORT LIBRARY PACKAGES NEEDED BY YOUR PROGRAM
// SOME CLASSES WITHIN A PACKAGE MAY BE RESTRICTED
// DEFINE ANY CLASS AND METHOD NEEDED
// CLASS BEGINS, THIS CLASS IS REQUIRED
public class Solution
{
    // METHOD SIGNATURE BEGINS, THIS METHOD IS REQUIRED
    char[] rangeFrequent(String str, int pair, int[][] rangeLR)
    {
        char[] chars = str.toCharArray();
        int[] nums = new int[26];
        for (int i = 0;i<pair;i++){
            int left = rangeLR[i][0]-1;
            int right = rangeLR[i][1]-1;
            setZero(nums);
            for (int j = left;j<=right;j++){

            }
        }
        return null;
    }

    public void setZero(int[] nums){
        for (int i =0;i<nums.length;i++){
            nums[i] = 0;
        }
    }
    // METHOD SIGNATURE ENDS
}


