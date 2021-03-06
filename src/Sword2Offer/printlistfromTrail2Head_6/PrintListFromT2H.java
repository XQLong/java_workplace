package Sword2Offer.printlistfromTrail2Head_6;

import Sword2Offer.TestInstance.ListNode;

import java.util.ArrayList;
import java.util.Stack;

/**
 * Created by xql on 2019/3/23.
 */
public class PrintListFromT2H {
    /*使用栈先入后出*/
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> arr = new ArrayList();
        Stack<Integer> stack = new Stack<Integer>();
        while (listNode!=null){
            stack.add(listNode.val);
            listNode = listNode.next;
        }
        while (!stack.isEmpty()){
            arr.add(stack.pop());
        }
        return arr;
    }

    /*使用递归*/
    public ArrayList<Integer> printListFromTailToHead2(ListNode listNode) {
        ArrayList<Integer> ret = new ArrayList<>();
        if (listNode != null) {
            ret.addAll(printListFromTailToHead(listNode.next));
            ret.add(listNode.val);
        }
        return ret;
    }

    /*使用头插法构造逆序链表*/
    public ArrayList<Integer> printListFromTailToHead3(ListNode listNode) {
        ArrayList<Integer> ret = new ArrayList<>();
        ListNode head = new ListNode(0);
        while (listNode!=null){
            ListNode temp = listNode.next;
            listNode.next = head.next;
            head.next = listNode;
            listNode = temp;
        }
        head =head.next;
        while (head!=null){
            ret.add(head.val);
            head = head.next;
        }
        return ret;
    }
}
