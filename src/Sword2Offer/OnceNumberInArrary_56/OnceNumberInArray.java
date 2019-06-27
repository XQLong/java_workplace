package Sword2Offer.OnceNumberInArrary_56;

/**
 * @Author: xql
 * @Date: Created in 21:14 2019/6/26
 */
public class OnceNumberInArray {
    public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
        //对数组中的数进行异或计算
        int yh = 0;
        for(int num:array) yh ^= num;
        //求取yh中从右往左第一个为1的位
        int p = getOnePoint(yh);
        for(int num:array){
            if((num & p)==1){
                num1[0] ^= num;
            }else {
                num2[0] ^= num;
            }
        }
    }
    //求取yh中从右往左第一个为1的位
    /*1、利用左移运算实现*/
    public int getOnePoint(int input){
        int p = 1;
        while ((input&p)!=p){
            p =p<<1;
        }
        return p;
    }
    /*2、利用n&(n-1)按位与实现
    * n&(n-1)可以将原本最低位的1变为0
    * */
    public int getOnePoint2(int input){
        int diff = input-(input&(input-1));
        return diff;
    }
}
