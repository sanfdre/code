package 剑指offer;


/**
 * @Author: lilinglin
 * @Description:
 * @Date: Created in 2018/8/7
 */
public class Solution_17_删除排序链表重复节点 {
    public ListNode deleteDuplication(ListNode pHead) {
        ListNode newHead= new ListNode(-1);
        newHead.next = pHead;
        ListNode pre = newHead;
        while (pre.next!=null){
            boolean delete = false;
            ListNode next = pre.next;
            ListNode nextNext = next.next;

            while (nextNext!=null&&next.val==nextNext.val){
                delete = true;
                nextNext = nextNext.next;
            }

            if(delete){
                pre.next=nextNext;
            }else {
                pre = next;
            }
        }
        return newHead.next;
    }
}
class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
