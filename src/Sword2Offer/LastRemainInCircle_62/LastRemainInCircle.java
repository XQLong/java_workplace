package Sword2Offer.LastRemainInCircle_62;

/**
 * @Author: xql
 * @Date: Created in 17:25 2019/7/1
 */
public class LastRemainInCircle {
    public int LastRemaining_Solution(int n, int m) {
        if(n<1) return -1;
        if(n==1) return 0;
        return (LastRemaining_Solution(n-1,m)+m)%n;
    }

    //数组模拟计算
    public int LastRemaining_Solution1(int n, int m) {
        if(n<1) return -1;
        if(n==1) return 0;
        int[] circle = new int[n];
        int len = n , cur = 0;
        while (len>1){
            int start = m-1;
            while (start>0){
                cur = CircelNext(circle,cur);
                start--;
            }
            circle[cur] = -1;
            cur = CircelNext(circle,cur);
            len--;
        }
        return cur;
    }

    public int CircelNext(int[] arr,int cur){
        int len = arr.length;
        int next = cur+1;
        if(next==len) next = 0;
        while (arr[next]==-1){
            if(next==len-1) next=0;
            else next++;
        }
        return next==len?0:next;
    }
}
