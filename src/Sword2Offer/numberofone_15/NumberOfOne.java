package Sword2Offer.numberofone_15;

/**
 * Created by xql on 2019/4/2.
 */
public class NumberOfOne {
    public int NumberOf1(int n) {
        int num = 0;
        while (n!=0){
            n = n&(n-1);
            num++;
        }
        return num;
    }
    //按位统计
    public int NumberOf1_(int n) {
        int num = 0;
        while (n!=0){
            if((n&1)==1) num++;
            n = n>>>1;//无符号右移运算符
        }
        return num;
    }
    //利用java中的Integer类的bitCount函数
    public int NumberOf1_2(int n) {
        int num = Integer.bitCount(n);
        return num;
    }
}
