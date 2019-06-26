package Sword2Offer.KthNodeInBinarySortTree_54;

import Sword2Offer.TestInstance.TreeNode;

public class KthNodeInBinarySortTree {
    int cnt = 0;
    TreeNode res;
    TreeNode KthNode(TreeNode pRoot, int k)
    {
        travelTreeNode(pRoot,k);
        return null;
    }
    //对链表进行中序遍历
    public void travelTreeNode(TreeNode node,int k){
        if(node==null) return;
        travelTreeNode(node.left,k);
        cnt++;
        if(cnt==k) {
            res = node;
            return;
        }
        travelTreeNode(node.right,k);
    }
}
