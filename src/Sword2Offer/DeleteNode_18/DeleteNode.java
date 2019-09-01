package Sword2Offer.DeleteNode_18;

import Sword2Offer.TestInstance.ListNode;

/**
 * Created by xql on 2019/4/16.
 */
public class DeleteNode {
    public ListNode deleterepeatnode(ListNode pHead){
        if (pHead==null||pHead.next==null) return pHead;
        ListNode next = pHead.next;
        if(pHead.val==next.val){
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
