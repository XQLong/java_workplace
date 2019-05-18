package Algorithms.Stack;

import Sword2Offer.TestInstance.ListNode;

/**
 * Created by xql on 2019/5/18.
 */
//栈的链表实现
public class ListNodeStack<Item> {
    private Node first;     //栈顶最新添加的元素
    private int N;      //元素数量
    private class Node{
        Item item;
        Node next;
    }
    public boolean isEmpity(){
        return first == null;
    }
    public int size(){
        return N;
    }
    public void push(Item item){
        Node oldfirst = first;
        first = new Node();
        first.item = item;
        first.next = oldfirst;
        N++;
    }
    public Item pop(){
        Node oldfisrt = first;
        first = oldfisrt.next;
        oldfisrt.next =null;
        return oldfisrt.item;
    }
}
