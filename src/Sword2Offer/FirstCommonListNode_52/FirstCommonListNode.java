package Sword2Offer.FirstCommonListNode_52;

import Sword2Offer.TestInstance.ListNode;

public class FirstCommonListNode {
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        ListNode cur1 = pHead1,cur2 = pHead2;
        while (cur1!=cur2){
            cur1 = cur1==null?pHead2:cur1.next;
            cur2 = cur2==null?pHead1:cur2.next;
            System.out.println("val1:"+cur1.val+"  val2:"+cur2.val);
        }
        return cur1;
    }
}
