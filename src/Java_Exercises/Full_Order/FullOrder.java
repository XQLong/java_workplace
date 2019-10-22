package Java_Exercises.Full_Order;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by xql on 2019/10/22.
 */
//数组字典序的全排列
public class FullOrder {
    public static void main(String[] args){
        int[] arr = {1,2,3};
        fullorder(arr,0,2);
    }
    public static void fullorder(int[] input,int l,int r){
        if(l==r) System.out.println(Arrays.toString(input));
        for(int i=l;i<=r;i++){
            swap(input,l,i);
            fullorder(input,l+1,r);
            swap(input,l,i);        //将数组还原
        }
    }
    //交换数组中的两个元素的位置
    public static void swap(int[] arr,int i,int j){
        int len = arr.length;
        if(i==j||i<0||i>=len||j<0||j>=len) return;
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
