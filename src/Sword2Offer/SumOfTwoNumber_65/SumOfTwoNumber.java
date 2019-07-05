package Sword2Offer.SumOfTwoNumber_65;

/**
 * @Author: xql
 * @Date: Created in 16:49 2019/7/5
 */
public class SumOfTwoNumber {
    public int Add(int num1,int num2) {
        return num2==0?num1:Add((num1^num2),(num1&num2<<1));
    }
}
