package Sword2Offer.MirrorOfTree_27;

import Sword2Offer.TestInstance.TreeNode;

/**
 * Created by xql on 2019/4/24.
 */
public class MirrorTree {
    public void Mirror(TreeNode root) {
        if(root==null) return;
        TreeNode left = root.left;
        TreeNode right = root.right;
        MirrorTrans(root);
        if(left!=null) Mirror(left);
        if(right!=null) Mirror(right);
    }
    public void MirrorTrans(TreeNode root){
        if(root==null) return;
        TreeNode left = root.left;
        TreeNode right = root.right;
        root.right = left;
        root.left = right;
    }
}
