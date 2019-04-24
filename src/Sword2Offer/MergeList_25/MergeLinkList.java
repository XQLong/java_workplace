package Sword2Offer.MergeList_25;

import Sword2Offer.TestInstance.ListNode;

/**
 * Created by xql on 2019/4/24.
 */
public class MergeLinkList {
    //迭代
    public ListNode Merge(ListNode list1, ListNode list2) {
        ListNode p1 = list1;
        ListNode p2 = list2;
        ListNode newlist = new ListNode(-1);
        ListNode cur = newlist;
        while (p1!=null&&p2!=null){
            int v1 = p1.val;
            int v2 = p2.val;
            if(p2==null||v1<=v2){
                cur.next = p1;
                p1 = p1.next;
            }else {
                cur.next = p2;
                p2 = p2.next;
            }
            cur = cur.next;
        }
        cur.next = p1!=null?p1:p2;
        return  newlist.next;
    }
    // 递归
    public ListNode Merge1(ListNode list1, ListNode list2) {
        if(list1==null) return list2;
        if(list2==null) return list1;
        if (list1.val<=list2.val){
            list1.next = Merge1(list1.next,list2);
            return list1;
        }else {
            list2.next = Merge1(list1,list2.next);
            return list2;
        }
    }
}
