package Sword2Offer.TransStrToInt_67;

/**
 * @Author: xql
 * @Date: Created in 19:36 2019/7/5
 */
public class TransStrToInt {
    public int StrToInt(String str) {
        char[] chars = str.toCharArray();
        int len = chars.length;
        int res = 0;
        if(len==0) return 0;
        boolean positive = true;
        if(chars[0]=='-') positive = false;
        for (int i=0;i<len;i++){
            if(i==0&&(chars[i]=='+'||chars[i]=='-')){
                continue;
            }
            if(chars[i]>='0' && chars[i]<='9'){
                res = res*10+(chars[i]-'0');
            }else {
                return 0;
            }
        }
        return positive?res:-res;
    }
}
