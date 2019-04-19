package Sword2Offer.ChangeOddEvenOrder_21;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by xql on 2019/4/19.
 */
public class ChangeOddEvenOrder {
    //未能保证偶数的顺序
    public void reOrderArray(int [] array) {
        int len = array.length;
        int ind = 0;
        int num = 0;
        while (ind<len){
            if(array[ind]%2!=0){
                if(ind!=num){
                    array = exchange(array,ind,num);
                }
                ind++;
                num++;
            }
            ind++;
        }
        for (int c:array){
            System.out.println(c);
        }
    }
    public int[] exchange(int[] arr,int m,int n){
        arr[m] = arr[m]^arr[n];
        arr[n] = arr[n]^arr[m];
        arr[m] = arr[m]^arr[n];
        return arr;
    }
    //方法2
    public void reOrderArray1(int [] array) {
        int len = array.length;
        int[] num = array.clone();
        int Oddnum = 0;
        for (int a:array){
            if(a%2==1) Oddnum++;
        }
        for (int i=0,o=0,e=0;i<len;i++){
            if(num[i]%2==1){
                array[o] = num[i];
                o++;
            }else {
                array[Oddnum+e] = num[i];
                e++;
            }
        }
        for (int a:array){
            System.out.println(a);
        }
    }
}
