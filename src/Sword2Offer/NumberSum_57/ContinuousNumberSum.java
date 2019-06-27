package Sword2Offer.NumberSum_57;

import java.util.ArrayList;

/**
 * @Author: xql
 * @Date: Created in 10:51 2019/6/27
 */
public class ContinuousNumberSum {
    //循环暴力求取
    public ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        int l = 1;
        while (l<(sum/2)+1){
            int r = l,s=l;
            while (s<sum){
                r++;
                s += r;
            }
            if(s==sum){
                ArrayList<Integer> arr = new ArrayList<>();
                for (int a=l;a<=r;a++) arr.add(a);
                res.add(arr);
            }
            l++;
        }
        return res;
    }
    //使用左右两个索引求取,通过调整索引值求取
    public ArrayList<ArrayList<Integer>> FindContinuousSequence1(int sum) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        int l = 1,r = l+1;
        int curSum = 3;
        while (r<sum){
            if(curSum<sum){
                r++;
                curSum += r;
            }
            else if(curSum>sum){
                curSum -= l;
                l++;
            }else {
                ArrayList<Integer> arr = new ArrayList<>();
                for (int a=l;a<=r;a++) arr.add(a);
                res.add(arr);
                curSum -= l;
                l++;
                r++;
                curSum += r;
            }
        }
        return res;
    }
}
