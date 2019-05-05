package Sword2Offer.RandomlinkListCopy_35;

import Sword2Offer.TestInstance.RandomListNode;

/**
 * Created by xql on 2019/5/5.
 */
public class RandomLinkListCopy {
    // 使用递归
    public RandomListNode Clone(RandomListNode pHead)
    {
        RandomListNode copynode = ResertCopyNode(pHead,null);
        RandomListNode randomnode = RandomNodeValue(copynode,null);
        return SplitRandomNode(randomnode,null);
    }
    // 在每个节点后面插入复制的节点
    public RandomListNode ResertCopyNode(RandomListNode pHead, RandomListNode res){
        if(res==null) res = pHead;
        if(pHead==null) return res;
        RandomListNode Next = pHead.next;
        RandomListNode newNode = new RandomListNode(pHead.label);
        pHead.next = newNode;
        newNode.next = Next;
        return ResertCopyNode(Next,res);
    }

    // 对复制节点的 random 链接进行赋值
    public RandomListNode RandomNodeValue(RandomListNode pHead, RandomListNode res){
        if(res==null) res = pHead;
        if(pHead==null) return res;
        RandomListNode Copy = pHead.next;
        RandomListNode next = Copy.next;
        Copy.random = pHead.random==null?null:pHead.random.next;
        return RandomNodeValue(next,res);
    }

    // 拆分
    public RandomListNode SplitRandomNode(RandomListNode pHead, RandomListNode res){
        if(pHead==null) return res;
        System.out.println(pHead.label);
        if(res==null) res = pHead.next;
        RandomListNode copy = pHead.next;
        RandomListNode next = copy.next;
        pHead.next = next;
        copy.next = next==null?null:next.next;
        return SplitRandomNode(next,res);
    }

    //使用迭代
    public RandomListNode Clone1(RandomListNode pHead)
    {
        if(pHead==null) return pHead;
        RandomListNode cur = pHead;
        // 复制节点并插入
        while (cur!=null){
            RandomListNode next = cur.next;
            RandomListNode newnode = new RandomListNode(cur.label);
            cur.next = newnode;
            newnode.next = next;
            cur = next;
        }

        // 为复制的节点的random赋值
        cur = pHead;
        while (cur!=null){
            RandomListNode copy = cur.next;
            RandomListNode next = copy.next;
            copy.random = cur.random==null?null:cur.random.next;
            cur = next;
        }

        // 对链表进行拆分
        cur = pHead;
        RandomListNode res = pHead.next;
        while (cur!=null){
            RandomListNode copy = cur.next;
            RandomListNode next = copy.next;
            cur.next = next;
            copy.next = next==null?null:next.next;
            cur = next;
        }
        return res;
    }
}
