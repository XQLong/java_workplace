package Sword2Offer.cutrope_14;

/**
 * Created by xql on 2019/3/31.
 */
public class CutRope {
    public int integerBreak(int n) {
        int[] dp = new int[n+1];
        dp[1] = 1;
        for(int i=2;i<=n;i++){
            for (int j =1;j<i;j++ ){
                dp[i] = Math.max(Math.max((i-j)*j,dp[j]*dp[i-j]),Math.max(j*dp[i-j],dp[i]));
            }
        }
        return dp[n];
    }
}
