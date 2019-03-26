**题目**

大家都知道斐波那契数列，现在要求输入一个整数n，请你输出斐波那契数列的第n项（从0开始，第0项为0）。 n<=39 

**要求**

时间限制：1秒 空间限制：32768K

----
**解答**

1.使用递归计算，会造成重复计算一些子问题。

例如，计算 f(10) 需要计算 f(9) 和 f(8)，计算 f(9) 需要计算 f(8) 和 f(7)，可以看到 f(8) 被重复计算了。

2.动态规划。也是将一个问题划分为多个子问题进行求解，但动态规划会把子问题缓存起来，从而避免重复求解子问题。
````
    public int fibonacci(int n) {
        if(n<=1) return n;
        int[] arr = new int[n+1];
        arr[1] = 1;
        for (int i=2;i<=n;i++){
            arr[i] = arr[i-1] + arr[i-2];
        }
        return arr[n];
    }
````

针对上述方法的两种改进：

因为考虑到第i项只与第i-1和i-2项相关，因此只需存储前两项的值，从而将空间复杂度由O(N)降低到O(1)。

````
    public int fibonacci(int n) {
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
````

由于待求解的n小于40，因此可以将前 40 项的结果先进行计算，之后就能以 O(1) 时间复杂度得到第 n 项的值了。

