package Sword2Offer.DeepOfBinaryTree_55;

import Sword2Offer.TestInstance.TreeNode;

/**
 * @Author:xql
 * @Date:Created in 20:38 2019/6/26
 */

public class BalancingBinarySearchTree {
    public boolean IsBalanced_Solution(TreeNode root) {
        if(root==null) return true;
        int diff_deep = getDeep(root.left)-getDeep(root.right);
        if(Math.abs(diff_deep)>1) return false;
        return IsBalanced_Solution(root.left)&&IsBalanced_Solution(root.right);
    }
    public int getDeep(TreeNode node){
        return node==null?0:1+Math.max(getDeep(node.left),getDeep(node.right));
    }
}
