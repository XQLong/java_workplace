package Sword2Offer.MaxProfit_63;

/**
 * @Author: xql
 * @Date: Created in 14:53 2019/7/5
 */
public class MaxProfit {
    //直接嵌套两层循环求取最大值
    public int maxProfit(int[] prices) {
        int len = prices.length;
        int res = 0;
        for(int i=0;i<len;i++){
            for(int j=i+1;j<len;j++){
                if(prices[j]-prices[i]>res){
                    res = prices[j]-prices[i];
                }else {
                    continue;
                }
            }
        }
        return res;
    }
    //遍历一次卖出时间，记录卖出时间前数组中的最小值
    public int maxProfit1(int[] prices) {
        int res = 0;
        int len = prices.length;
        if(len<1) return res;
        int min = prices[0];
        for(int i=1;i<len;i++){
            res = prices[i]-min>res?prices[i]-min:res;
            min = prices[i]<min?prices[i]:min;
        }
        return res;
    }
}
