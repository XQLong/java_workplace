package Sword2Offer.StringPresentNum_20;

/**
 * Created by xql on 2019/4/19.
 */
public class StringPresentNumber {
    public boolean isNumeric(char[] str) {
        String patttern = "[+-]?\\d*(\\.\\d+)?([eE][+-]?\\d+)?";
        if (str==null||str.length==0){
            return false;
        }
        return new String(str).matches(patttern);
    }
}
