package Sword2Offer.GreatestSumOfSubArray_42;

public class GreatestSumOfSubArray {
    public int FindGreatestSumOfSubArray(int[] array) {
        int len = array.length;
        if(len==1) return array[0];
        int Sum = array[0],curMaxSum = array[0];
        for(int i=1;i<len;i++){
            Sum = Sum<0?array[i]:Sum + array[i];
            curMaxSum = Math.max(curMaxSum,Sum);
        }
        return curMaxSum;
    }
}
