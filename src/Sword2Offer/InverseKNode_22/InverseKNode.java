package Sword2Offer.InverseKNode_22;

import Sword2Offer.TestInstance.ListNode;

import java.util.Stack;

/**
 * Created by xql on 2019/4/19.
 */
public class InverseKNode {
    public ListNode FindKthToTail(ListNode head, int k) {
        Stack<ListNode> stack = new Stack<>();
        if(head==null||k==0) return null;
        stack.push(head);
        ListNode next = head.next;
        while (next!=null){
            stack.push(next);
            next = next.next;
        }
        for (int i=1;i<k;i++){
            if(stack.isEmpty()) return null;
            stack.pop();
        }
        return stack.isEmpty()?null:stack.pop();
    }
}
