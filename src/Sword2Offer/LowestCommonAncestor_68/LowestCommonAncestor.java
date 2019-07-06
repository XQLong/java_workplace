package Sword2Offer.LowestCommonAncestor_68;

import Sword2Offer.TestInstance.TreeNode;

/**
 * @Author: xql
 * @Date: Created in 20:13 2019/7/5
 */
public class LowestCommonAncestor {
    //二叉搜索树的最低公共祖先节点
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null) return root;
        if(root.val>p.val && root.val>q.val){
            return lowestCommonAncestor(root.left,p,q);
        }else if(root.val<p.val && root.val<q.val){
            return lowestCommonAncestor(root.right,p,q);
        }
        return root;
    }
    //普通二叉树的最低公共祖先节点
    public TreeNode lowestCommonAncestor1(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null||root==p||root==q) return root;
        TreeNode left = lowestCommonAncestor1(root.left,p,q);
        TreeNode right = lowestCommonAncestor1(root.right, p, q);
        return left == null ? right : right == null ? left : root;
    }
}
