package Sword2Offer.minNumberInRotateArray_11;

/**
 * Created by xql on 2019/3/30.
 */
public class MinNumberInRotateArray {
    //直接查找时间复杂度为O(N)的算法
    public int minNumberInRotateArray(int [] array) {
        int len =  array.length;
        if(len<1) return 0;
        else if(len<3&&len>0) return array[len-1];
        else {
            int i=len-1;
            while (i>0){
                if(array[i]>=array[i-1]){
                    i--;
                }else {
                    return array[i];
                }
            }
        }
        return array[len-1];
    }
    //采用二分查找的方法，时间复杂度为O(logN)
    public int minNumberInRotateArray1(int [] array) {
        int len =  array.length;
        if(len<1) return 0;
        int indhead = 0;
        int indend = len-1;
        while (!((indend-indhead)<=1)){
            int indcompare = (indend+indhead)/2;
            if (array[indhead]>array[indcompare]){
                indend = indcompare;
            }else if(array[indhead]<array[indcompare]){
                indhead = indcompare;
            }if(array[indhead]>array[indcompare]&&array[indhead]>array[indcompare]){
                return minvalue(array,indhead,indend);
            }
        }
        return array[indhead]<=array[indend]?array[indhead]:array[indend];
    }
    public int minvalue(int[] arr,int indhead,int indend){
        for (int i=indhead;i<=indend;i++){
            if(arr[indhead]>arr[indhead+1]) return arr[indhead+1];
        }
        return arr[indhead];
    }
}
