package Sword2Offer.TransNumberToString_46;

import java.util.ArrayList;

public class TransNumberToString {
    public int numDecodings(String s) {
        char[] chars = s.toCharArray();
        int len = chars.length;
        if(len==0||chars[0]=='0') return 0;
        if(len==1) return 1;
        int[] f = new int[len+1];
        f[len] = 1;
        f[len-1] = chars[len-1]=='0'?0:1;
        for(int i = len-2;i>=0;i--){
            String s0 = String.valueOf(chars[i]);
            if(s0.equals("0")){
                f[i] = 0;
                continue;
            }
            String s1 = String.valueOf(chars[i+1]);
            String s01 = s0+s1;
            f[i] = Integer.valueOf(s01)<27?f[i+1]+f[i+2]:f[i+1];
        }
        return f[0];
    }
}
