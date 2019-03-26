package Sword2Offer.fibonacci_10;

/**
 * Created by xql on 2019/3/26.
 */
public class Fibonacci {
    public int fibonacci(int n) {
        if(n==0) return n;
        int[] arr = new int[n+1];
        arr[1] = 1;
        for (int i=2;i<=n;i++){
            arr[i] = arr[i-1] + arr[i-2];
        }
        return arr[n];
    }
    public int fibonacci1(int n) {
        if (n<=1) return n;
        int pre1 = 1;
        int pre2 = 0;
        int i=1;
        int res = 0;
        while(i!=n){
            res = pre1 + pre2;
            pre2 = pre1;
            pre1 = res;
            i++;
        }
        return res;
    }
    //青蛙跳台阶问题
    public int fibonacci2(int n) {
        if(n<=2) return n;
        int pre2 = 1;
        int pre1 = 2;
        int res = 0;
        for(int i=3;i<=n;i++){
            res = pre2 + pre1;
            pre2 = pre1;
            pre1 = res;
        }
        return res;
    }
    //变态青蛙跳台阶问题
    public int fibonacci3(int n) {
        if (n<=2) return n;
        int[] arr = new int[n+1];
        arr[1] = 1;
        arr[2] = 2;
        for(int i = 3;i<=n;i++){
            int j = 1;
            while (i-j>0)
            {
                arr[i] += arr[i-j];
                j++;
            }
            arr[i]++;
        }
        return arr[n];
    }

}
