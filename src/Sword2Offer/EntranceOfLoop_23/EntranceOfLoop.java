package Sword2Offer.EntranceOfLoop_23;

import Sword2Offer.TestInstance.ListNode;

/**
 * Created by xql on 2019/4/19.
 */
public class EntranceOfLoop {
    public ListNode EntryNodeOfLoop(ListNode pHead)
    {
        ListNode node = pHead;
        ListNode meetNode = FindMeetPoint(pHead);
        while (node.next!=null&&meetNode.next!=null){
            meetNode = meetNode.next;
            if(node==meetNode){
                return node;
            }
            node = node.next;
        }
        return null;
    }
    public ListNode FindMeetPoint(ListNode pHead){
        ListNode slow = pHead;
        if (slow==null||slow.next==null) return null;
        ListNode fast = pHead.next;
        while (slow.next!=null&&fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast){
                return slow;
            }
        }
        return null;
    }
}
