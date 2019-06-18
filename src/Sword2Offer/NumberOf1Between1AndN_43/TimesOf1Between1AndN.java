package Sword2Offer.NumberOf1Between1AndN_43;

public class TimesOf1Between1AndN {
    public int NumberOf1Between1AndN_Solution(int n) {
        if(n<=0) return 0;
        int cnt = 0,val = 0,s=n,p=0,left = 0;
        //遍历计算i位
        for(int i=1;i<=n;i*=10){
            left = n%i; //i位的余数
            p = s%10;   //i位上的值
            s = s/10;   //i位上的余数
            cnt += p>1?p*val+i:p*val+p*(left+1);
            val = 10*val+i;    //N(0,9..9)的值，其中9的个数为i
        }
        return cnt;
    }
}
