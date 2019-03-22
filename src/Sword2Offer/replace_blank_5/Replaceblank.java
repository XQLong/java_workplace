package Sword2Offer.replace_blank_5;

/**
 * Created by xql on 2019/3/22.
 */
public class Replaceblank {
    public String replaceSpace(StringBuffer str) {
        char[] arrc = str.toString().toCharArray();
        String res = "";
        for(int i=0;i<arrc.length;i++){
            if(arrc[i]==' '){
                res += "%20";
            }else {
                res += arrc[i];
            }
        }
        return res;
    }
}
