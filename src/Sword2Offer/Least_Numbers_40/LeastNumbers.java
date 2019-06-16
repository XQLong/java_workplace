package Sword2Offer.Least_Numbers_40;

import java.util.ArrayList;

public class LeastNumbers {
    int [] temp;
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> res = new ArrayList<>();
        int len = input.length;
        if(k>len) return res;
        temp = new int[len];
        for(int i=0;i<len;i++) temp[i] = input[i];
        findPartition(0,len-1,k);
        for (int j=0;j<k;j++) res.add(temp[j]);
        return res;
    }
    public void findPartition(int i,int j,int k){
        if(k==temp.length||i>=j) return;
        int mid = partition(i,j);
        if(k==mid) return;
        if(mid>k){
            findPartition(i,mid-1,k);
        }else {
            findPartition(mid+1,j,k);
        }
    }
    public int partition(int i,int j){
        int len = temp.length;
        if(i>=j||i<0||j>=len) return 0;
        int a0 = temp[i],l = i+1,r = j;
        while (r-l>=0){
            while (temp[l]<a0) l++;
            while (temp[r]>=a0) r--;
            if(temp[l]>=a0&&temp[r]<a0){
                temp = swaparr(temp,l,r);
                r--;
                l++;
            }
        }
        temp = swaparr(temp,i,r);
        return r;
    }
    public int[] swaparr(int[] input,int i,int j){
        if(i==j) return input;
        int t = input[i];
        input[i] = input[j];
        input[j] = t;
        return input;
    }
}
