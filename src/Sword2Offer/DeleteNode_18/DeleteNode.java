package Sword2Offer.DeleteNode_18;

import Sword2Offer.TestInstance.ListNode;

/**
 * Created by xql on 2019/4/16.
 */
public class DeleteNode {
    public ListNode deletenode(ListNode head,ListNode node){
        if (head==null||head.next==null) return null;
        ListNode n = head;
        while (n.next!=null){
            if (n.next==node){
                //node节点为末节点
                if(node.next==null){
                    n.next = null;
                    return head;
                }
                //node节点不为末节点
                else {
                    n.next = node.next;
                    return head;
                }
            }
            n = n.next;
        }
        return head;
    }
    public ListNode deleterepeatnode(ListNode pHead){
        if (pHead==null||pHead.next==null) return pHead;
        ListNode next = pHead.next;
        if(pHead.val == next.val){
            while (next!=null&&pHead.val==next.val){
                next = next.next;
            }
            return deleterepeatnode(next);
        }else {
            pHead.next = deleterepeatnode(pHead.next);
            return pHead;
        }
    }
}
