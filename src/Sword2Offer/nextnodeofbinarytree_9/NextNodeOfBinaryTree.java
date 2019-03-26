package Sword2Offer.nextnodeofbinarytree_9;

import Sword2Offer.TestInstance.TreeLinkNode;

/**
 * Created by xql on 2019/3/25.
 */
public class NextNodeOfBinaryTree {
    public TreeLinkNode GetNext(TreeLinkNode pNode)
    {
        if(pNode.right!=null){
            TreeLinkNode node = pNode.right;
            while (node.left!=null){
                node = node.left;
            }
            return node;
        }else {
            while(pNode.next!=null){
                TreeLinkNode parent = pNode.next;
                if (parent.left == pNode){
                    return parent;
                }
                pNode = pNode.next;
            }
        }
        return null;
    }
}
