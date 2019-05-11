package Sword2Offer.MoreThanHalfNum_39;

import java.util.HashMap;

/**
 * Created by xql on 2019/5/11.
 */
public class MoreThanHalfNum {
    //直接使用hashmap的性质来统计
    public int MoreThanHalfNum_Solution1(int [] array){
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        int len = array.length;
        int mid = len/2;
        if(array.length==1) return array[0];
        for (int i=0;i<len;i++){
            if(!hashMap.containsKey(array[i])){
                hashMap.put(array[i],1);
            }else {
                int value = hashMap.get(array[i]);
                value++;
                if(value>mid) return array[i];
                hashMap.put(array[i],value);
            }
        }
        return 0;
    }
    // Moore’s Vote Algorithm
    public int MoreThanHalfNum_Solution(int [] array) {
        int len = array.length;
        int mid = len/2;
        if(array.length<1) return 0;
        int num = array[0];
        int cnt = 1;
        for (int i=1;i<len;i++){
            if(cnt==0){
                num = array[i];
                cnt = 1;
            }else {
                if (array[i]==num){
                    cnt++;
                }else {
                    cnt--;
                }
            }
        }
        for (int j=0,count = 0;j<len;j++){
            if(array[j]==num) count++;
            if(count>mid) return num;
        }
        return 0;
    }
}
