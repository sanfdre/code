package 剑指offer;

/**
 * @Author: lilinglin
 * @Description:
 * @Date: Created in 2018/6/28
 */
public class Solution_8_二叉树的下一个节点 {

    public static void main(String[] args) {
    }

    public static TreeLinkNode getNext(TreeLinkNode pNode){
        if(pNode == null){
            return null;
        }
        if(pNode.right!=null){
            TreeLinkNode temp = pNode.right;
            while (temp.left!=null){
                temp = temp.left;
                if(temp.left ==null){
                    return temp;
                }
            }
            return temp;
        }
        TreeLinkNode parent = pNode.next;
        TreeLinkNode temp = pNode;

        while (parent!=null){
            if(parent.left==temp){
                return parent;
            }
            temp = parent;
            parent = temp.next;
        }
        return parent;
    }
}
class TreeLinkNode {
    int val;
    TreeLinkNode left = null;
    TreeLinkNode right = null;
    TreeLinkNode next = null;

    TreeLinkNode(int val) {
        this.val = val;
    }
}