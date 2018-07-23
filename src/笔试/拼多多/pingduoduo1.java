package 笔试.拼多多;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @Author: lilinglin
 * @Description:
 * @Date: Created in 2018/7/22
 */
public class pingduoduo1 {
    //    1
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = Integer.parseInt(sc.nextLine());
//
//        String Alice = "Alice";
//        String Bob = "Bob";
//        String Cathy = "Cathy";
//        String Dave = "Dave";
//
//        int sum = 4;
//        int now = 4;
//
//        while (n>sum){
//            now = now*2;
//            sum = sum+now;
//        }
//
//        int subline = n-(sum-now);
//        int temp = now/4;
//        boolean flag = false;
//        if(subline%temp==0){
//            flag = true;
//        }
//
//        int result = 0;
//        if(flag){
//            result = subline/temp;
//        }else {
//            result = subline/temp+1;
//        }
//
//        switch (result){
//            case 1:
//                System.out.println(Alice);break;
//            case 2:
//                System.out.println(Bob);break;
//            case 3:
//                System.out.println(Cathy);break;
//            case 4:
//                System.out.println(Dave);break;
//            default:
//                System.out.println("");
//        }
//    }

    //    2
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String str = sc.nextLine();
//        String[] strs = str.split(" ");
//        int[] weights = new int[strs.length];
//        for (int i=0;i<strs.length;i++){
//            weights[i] = Integer.parseInt(strs[i]);
//        }
//        Arrays.sort(weights);
//        int sum = 0;
//        int remaining = 300;
//
//        for(int i = weights.length-1;i>=0;i--){
//            if(weights[i]==0){
//                continue;
//            }
//            remaining = load(i,remaining,weights);
//            for(int j = i;j>=0;j--){
//                if(weights[j]!=0){
//                    if(weights[j]<=remaining){
//                        remaining = load(j,remaining,weights);
//                    }
//                }
//            }
//            if(remaining==100){
//                for(int j = 0;j<=i;j++){
//                   if(weights[j]>100){
//                       break;
//                   }else if(weights[j]==100){
//                       remaining = load(j,remaining,weights);
//                   }else {
//                       continue;
//                   }
//                }
//            }
//            remaining =300;
//            sum++;
//        }
//        System.out.println(sum);
//    }
//
//    public static int load(int index,int remaining,int[] weights){
//        remaining = remaining-weights[index];
//        weights[index] = 0;
//        return remaining;
//    }

    //    3

    private static int left;
    private static int right;
    private static int result;
    private static String resultStr;
    private static int num;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line1 = sc.nextLine();
        String line2 = sc.nextLine();
        String[] strs = line1.split(" ");
        int n = Integer.parseInt(strs[0]);
        int k = Integer.parseInt(strs[1]);

        char[] chars = line2.toCharArray();
        int[] phone = new int[chars.length];
        for (int i = 0;i<chars.length;i++){
            phone[i] = chars[i]-48;
        }
        Arrays.sort(phone);

        int min = phone[0];
        int max = phone[n-1];

        for (int i = min;i<=max;i++){
            int index = -1;
            int[] nums = new int[10];
            num = 0;
            int sum = 0;
            String str = line2;
            index = Arrays.binarySearch(phone,i);
            left = index-1;
            right = index+1;
            while (num<k){
                sum = change(phone,index,left,right,nums,sum);
            }
            str = getResultStr(nums,chars,i);
            if(sum<result){
                result = sum;
                resultStr = str;
            }else if(sum == result) {
                if(resultStr.compareTo(str)>0){
                    resultStr = str;
                }
            }
        }
        System.out.println(result);
        System.out.println(resultStr);
    }

    public static String getResultStr(int nums[],char[] phone,int index){
        for (int i = 0;i<nums.length-1;i++){
            int j = 0;
            while (nums[i]!=0){
                if((phone[j]-48)==i){
                    phone[j] = (char) (index+48);
                    nums[i] = nums[i]-1;
                }
                j++;
            }
        }
        return new String(phone);
    }

    public static int change(int[] phone,int index,int left,int right,int[] nums,int sum){
        if(left>=0 && right<=nums.length-1){
            int leftValue = phone[left];
            int rightValue = phone[right];
            int indexValue = phone[index];
            if((indexValue-leftValue)>(rightValue-leftValue)){
                nums[rightValue] = nums[rightValue]+1;
                right++;
                sum = sum+rightValue;
            }else {
                nums[leftValue] = nums[leftValue]+1;
                left--;
                sum = sum+leftValue;
            }
        }else if(left<0 && right<=nums.length-1){
            int rightValue = phone[right];
            nums[rightValue] = nums[rightValue]+1;
            right++;
            sum = sum+rightValue;
        }else if(left>=0 && right>nums.length-1){
            int leftValue = phone[left];
            nums[leftValue] = nums[leftValue]+1;
            left--;
            sum = sum+leftValue;
        }
            num++;
        return sum;
    }
}
