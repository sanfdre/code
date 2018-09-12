package 剑指offer;

/**
 * @Author: lilinglin
 * @Description:
 * @Date: Created in 2018/8/7
 */
public class Solution_17_二叉搜索树与双向链表 {
    public TreeNode Convert(TreeNode pRootOfTree) {
        return null;
    }

    public void forEach(TreeNode pRootOfTree,TreeNode lastNode){
        if(pRootOfTree==null){
            return ;
        }

        forEach(pRootOfTree.left, lastNode);

        pRootOfTree.left=lastNode;
        if(lastNode!=null){
            lastNode.right=pRootOfTree;
        }

        lastNode=pRootOfTree;

        forEach(pRootOfTree.right,lastNode);


    }

}

class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;
    }
}
