package Sword2Offer.RandomlinkListCopy_35;

import Sword2Offer.TestInstance.RandomListNode;

/**
 * Created by xql on 2019/5/5.
 */
public class RandomLinkListCopy {
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
}
