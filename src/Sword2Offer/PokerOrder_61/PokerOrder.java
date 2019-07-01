package Sword2Offer.PokerOrder_61;

import java.util.PriorityQueue;

/**
 * @Author: xql
 * @Date: Created in 15:11 2019/7/1
 */
public class PokerOrder {
    public boolean isContinuous(int [] numbers) {
        int num0 = 0;   //赖子个数
        int len = numbers.length;
        if(len==0) return false;
        PriorityQueue<Integer> queue = new PriorityQueue<>();   //小顶堆
        for(int n:numbers)  queue.add(n);
        while (queue.peek()==0){
            queue.poll();
            num0++;
        }
        while (queue.size()>0){
            int a = queue.poll();
            if(queue.size()==0) break;
            int b = queue.peek();
            int c = b-a;
            if(c<=0) return false;
            else {
                num0 -= (c-1);
                if(num0<0) return false;
            }
        }
        return true;
    }
}
