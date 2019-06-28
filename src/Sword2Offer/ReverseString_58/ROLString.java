package Sword2Offer.ReverseString_58;

/**
 * @Author: xql
 * @Date: Created in 9:44 2019/6/28
 */
public class ROLString {
    //利用上一题的翻转函数
    public String LeftRotateString(String str,int n) {
        String res = "";
        char[] chars = str.toCharArray();
        int len = chars.length;
        if(len<=0) return res;
        ReverseWords rw = new ReverseWords();
        rw.RevereseChars(chars,0,n);
        rw.RevereseChars(chars,n,len-1);
        rw.RevereseChars(chars,0,len-1);
        for (char c:chars) res += String.valueOf(c);
        return res;
    }
}
