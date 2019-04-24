package Sword2Offer.SubTree_26;

import Sword2Offer.TestInstance.TreeNode;

/**
 * Created by xql on 2019/4/24.
 */
public class SubTree {
    //遍历root1中的所有结点作为根节点，分别与子树进行比较
    public boolean HasSubtree(TreeNode root1, TreeNode root2) {
        if(root1==null||root2==null) return false;
        if(compareTree(root1,root2)) return true;
        TreeNode left = root1.left;
        TreeNode right = root1.right;
        if(compareTree(left,root2)) return true;
        if(compareTree(right,root2)) return true;
        return HasSubtree(left,root2)||HasSubtree(right,root2);
    }
    //比较两个树是否相同
    public boolean compareTree(TreeNode root1, TreeNode root2){
        if(root2==null) return true;    //root2为子树
        if(root1==null) return false;
        if(root1.val!=root2.val){
            return false;
        }else {
            return compareTree(root1.left,root2.left)&&compareTree(root1.right,root2.right);
        }
    }
}
