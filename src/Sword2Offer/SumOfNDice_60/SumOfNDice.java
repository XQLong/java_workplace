package Sword2Offer.SumOfNDice_60;

import java.util.*;

/**
 * @Author: xql
 * @Date: Created in 16:58 2019/6/28
 */
public class SumOfNDice {
    public List<Map.Entry<Integer, Double>> dicesSum(int n) {
        List<Map.Entry<Integer,Double>> res =new ArrayList<Map.Entry<Integer,Double>>();
        int maxSum = 6*n;       //  和的最大值
        //当骰子个数较多时每个值出现的情况会很多，因而使用long型
        long[][] arr = new long[maxSum+1][n+1];   //构建一个n行，maxSum列的矩阵（0行和0例不计）保存点数出现的情况次数
        long p0 = 1;
        final double p = Math.pow(6, n);
        arr[1][1] = p0;arr[2][1] = p0;arr[3][1] = p0;arr[4][1] = p0;arr[5][1] = p0;arr[6][1] = p0;
        Map<Integer,Double> map = new HashMap<Integer,Double>();
        for(int i=1;i<=maxSum;i++){
            for(int j=2;j<=n;j++){
                long p1 = (i-1)>0?arr[i-1][j-1]:0;
                long p2 = (i-2)>0?arr[i-2][j-1]:0;
                long p3 = (i-3)>0?arr[i-3][j-1]:0;
                long p4 = (i-4)>0?arr[i-4][j-1]:0;
                long p5 = (i-5)>0?arr[i-5][j-1]:0;
                long p6 = (i-6)>0?arr[i-6][j-1]:0;
                arr[i][j] = p1+p2+p3+p4+p5+p6;
            }
        }
        for(int s=n;s<=maxSum;s++){
            if(arr[s][n]>0) map.put(s,(double)arr[s][n]/p);
        }
        for (Map.Entry<Integer,Double> m:map.entrySet()) res.add(m);
        return res;

    }
}
