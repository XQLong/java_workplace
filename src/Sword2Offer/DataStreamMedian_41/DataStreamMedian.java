package Sword2Offer.DataStreamMedian_41;

import java.util.PriorityQueue;

/**
 * Created by xql on 2019/6/16.
 */
public class DataStreamMedian {
    //最大堆保存数据左半部分
    PriorityQueue<Integer> left = new PriorityQueue<>(((o1, o2) -> o2-o1));
    //最小堆保存数据右半部分
    PriorityQueue<Integer> right = new PriorityQueue<>();
    //输入的数据个数
    int N;
    public void Insert(Integer num) {
        //当前输入数据个数为偶数,右边放入数据
        if(N%2==0){
            left.offer(num);
            right.offer(left.poll());
        }
        //当前输入数据个数为奇数,左边放入数据
        else {
            right.offer(num);
            left.offer(right.poll());
        }
        N++;
    }

    public Double GetMedian() {
        Double res = 0.0;
        if(N%2==0){
            res = (left.peek().doubleValue()+right.peek().doubleValue())/2;
        }else {
            res = right.peek().doubleValue();
        }
        return res;
    }
}
