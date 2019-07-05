package Sword2Offer.SumOfOneToN_64;

/**
 * @Author: xql
 * @Date: Created in 16:15 2019/7/5
 */
public class SumOfOneToN {
    public int Sum_Solution(int n) {
        int res = n;
        boolean b = (n>0)&&(res += Sum_Solution(n-1))>0;
        return res;
    }
}
