package Sword2Offer.ReverseLinkList_24;

import Sword2Offer.TestInstance.ListNode;

/**
 * Created by xql on 2019/4/23.
 */
public class ReverseLinkList {
    //递归
    public ListNode ReverseList(ListNode head) {
        if(head==null||head.next==null) return head;
        ListNode next = head.next;
        head.next = null;
        ListNode newhead = ReverseList(next);
        next.next = head;
        return newhead;
    }

    //迭代
    public ListNode ReverseList1(ListNode head) {
        if(head==null||head.next==null) return head;
        ListNode newList = new ListNode(-1);
        while (head!=null){
            ListNode next = head.next;
            head.next = newList.next;
            newList.next = head;
            head = next;
        }
        return newList.next;
    }
}
