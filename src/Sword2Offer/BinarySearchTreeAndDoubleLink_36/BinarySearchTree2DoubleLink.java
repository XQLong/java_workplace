package Sword2Offer.BinarySearchTreeAndDoubleLink_36;

import Sword2Offer.TestInstance.TreeNode;

/**
 * Created by xql on 2019/5/5.
 */
public class BinarySearchTree2DoubleLink {
    TreeNode lefthead = null;
    TreeNode righthead = null;
    public TreeNode Convert(TreeNode pRootOfTree) {
        if(pRootOfTree==null) return pRootOfTree;
        TreeTraverse(pRootOfTree);
        return lefthead;
    }
    // 中序遍历
    public void TreeTraverse(TreeNode pHead){
        if(pHead==null) return;
        TreeTraverse(pHead.left);
        if(righthead==null) {
            lefthead = pHead;
            righthead = pHead;
        }else {
            pHead.left = righthead;
            righthead.right = pHead;
            righthead = pHead;
        }
        TreeTraverse(pHead.right);
    }
}
