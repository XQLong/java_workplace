package Sword2Offer.DataStreamMedian_41;

import java.util.LinkedList;
import java.util.Queue;

public class DataStreamOnce {
    //使用一个长度为256的数组来对字符出现的次数进行统计
    int[] cnts = new int[256];
    //使用队列来保存数据
    Queue<Character> queue = new LinkedList<>();
    //Insert one char from stringstream
    public void Insert(char ch)
    {
        cnts[ch]++;
        queue.offer(ch);
        while(!queue.isEmpty()&&cnts[queue.peek()]>1){
            queue.poll();
        }
    }
    //return the first appearence once char in current stringstream
    public char FirstAppearingOnce()
    {
        return queue.isEmpty()?'#':queue.peek();
    }
}
