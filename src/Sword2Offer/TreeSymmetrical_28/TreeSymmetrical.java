package Sword2Offer.TreeSymmetrical_28;

import Sword2Offer.TestInstance.TreeNode;

/**
 * Created by xql on 2019/4/24.
 */
public class TreeSymmetrical {
    public boolean isSymmetrical(TreeNode pRoot)
    {
        if(pRoot==null) return true;
        return TreeSymmetrical(pRoot.left,pRoot.right);
    }
    public boolean TreeSymmetrical(TreeNode pRoot1,TreeNode pRoot2){
        if(pRoot1==null&&pRoot2==null) return true;
        if(pRoot1==null||pRoot2==null) return false;
        if (pRoot1.val!=pRoot2.val) return false;
        return TreeSymmetrical(pRoot1.left,pRoot2.right)&&TreeSymmetrical(pRoot1.right,pRoot2.left);
    }
}
