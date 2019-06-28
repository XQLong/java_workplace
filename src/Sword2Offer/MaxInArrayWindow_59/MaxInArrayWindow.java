package Sword2Offer.MaxInArrayWindow_59;

import java.util.ArrayList;
import java.util.PriorityQueue;

/**
 * @Author: xql
 * @Date: Created in 15:37 2019/6/28
 */
public class MaxInArrayWindow {
    public ArrayList<Integer> maxInWindows(int [] num, int size)
    {
        ArrayList<Integer> res = new ArrayList<>();
        int len = num.length , ind =0;
        if(size<=0||len==0) return res;
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((o1,o2)->(o2-o1));
        while (ind+size<=len){
            int i = ind;
            while (maxHeap.size()<size){
                maxHeap.offer(num[i]);
                i++;
            }
            if(maxHeap.size()==size) res.add(maxHeap.poll());
            while (maxHeap.size()>0){
                maxHeap.poll();
            }
            ind++;
        }
        return res;
    }
}
