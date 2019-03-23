package Sword2Offer.TestInstance;

/**
 * Created by xql on 2019/3/23.
 * 链表测试用例
 */
public class ListNode {
    public int val = 0;
    public ListNode(int a){
        this.val = a;
    }
    public ListNode next = null;

    public void addnode(ListNode newnode){
        if(next==null){
            this.next = newnode;
        }else {
            this.next.addnode(newnode);
        }
    }

    public void printnode(){
        if(this!=null){
            System.out.println(this.val);
        }else {
            System.out.println("Node is null");
        }
    }
}
