package 笔试.大疆7月8日;

/**
 * @Author: lilinglin
 * @Description:
 * @Date: Created in 2018/7/8
 */
public class DaJiang {

    //给定非负整数数组，初始时在数组起始位置放置一机器人，数组的每个元素表示在当前位置机器人一步最大能够跳跃的数目。它的目的是用最少的步数到达数组末端。
    //
    //例如：
    //
    //给定数组A=[2,3,1,1,2]，最少跳步数目为2，对应的跳法是2->3->2，数组位置变化为0->1->4。
    //
    //[2,3,1,1,2,4,1,1,6,1,7]，所需步数为5。
    //[5,3,1,1,1,1,1,1,6,1,7]，所需步数为5。
//    public int jump(int[] a){
//         int now = 0;
//         int far = 0;
//         int step=0;
//         while(now<a.length){
//         if(now>far.length-1){
//         return step+1;
//         }
//        int next = now;
//        int temp = far;
//        while(now<=temp){
//        if(a[now]+now>far){
//        next = now;
//                far = a[now]+now;
//            }
//        now++;
//        }
//        step++;
//        now = next;
//}
//return -1;
//    }

//    public static int jump(int[] array){
//        int now = 0;
//        int size = array.length;
//        int canJumpMax = array[now];
//        int distance = size-1-now;
//        int step = 0;
//
//        while (now<size){
//            if(canJumpMax>=distance){
//                step++;
//                break;
//            }
//
//        }

        public static int jump(int [] A) {
            int jumps = 0;  //当前已经跳跃的步数
            int curEnd = 0; //当前位置能够跳跃的最远距离
            int curFarthest = 0; //在[0, curEnd]范围能的位置，能够跳跃的最远距离

            for (int i = 0; i < A.length-1; ++i) {
                curFarthest = max(curFarthest, i+A[i]);
                if (i == curEnd) {
                    jumps++;
                    curEnd = curFarthest;
                    if (curFarthest >= A.length-1) return jumps;
                }
            }
            return curFarthest >= A.length-1 ? jumps : -1;
        }

        public static int max(int i,int j){
            if(i>j){
                return i;
            }else {
                return j;
            }
        }

    public static void main(String[] args) {
        int[] array =  {5,1,5,1,1,1,6,1,4,1,1,1};
        System.out.println(jump(array));
    }
}
