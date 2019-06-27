package Sword2Offer.NumberSum_57;

import java.util.ArrayList;

/**
 * @Author: xql
 * @Date: Created in 9:29 2019/6/27
 */
public class TwoNumberSum {
    public ArrayList<Integer> FindNumbersWithSum(int [] array, int sum) {
        ArrayList<Integer> res = new ArrayList<>();
        int len = array.length;
        int l = 0 ,r = len-1;
        while (l<r){
            int s = array[l]+array[r];
            if(sum == s) {
                res.add(array[l]);
                res.add(array[r]);
                break;
            }
            else if(s<sum) l++;
            else r--;
        }
        return res;
    }
}
