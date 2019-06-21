package Sword2Offer.LongestSubString_48;

import java.lang.reflect.Array;
import java.util.Arrays;

public class LongestSubString {
    //使用两层循环暴力求解
    public int getLongestSubString(String str){
        char[] chars = str.toCharArray();
        int len = chars.length ,falg = 0,res = 0;
        for(int i=0;i<len;i++){
            char c = chars[i];
            for(int j=falg;j<i;j++){
                if(c==chars[j]) falg = j+1;
            }
            res = Math.max(res,(i-falg+1));
        }
        return res;
    }

    //空间换时间，使用数组记录字符最后出现的位置
    public int longestSubStringWithoutDuplication(String str) {
        int res = 0 ,flag = 0;
        char[] chars = str.toCharArray();
        int len = chars.length;
        int[] indexs = new int[26];     //用来记录26个字母在字符串中最后出现的位置
        Arrays.fill(indexs,-1);
        for(int i=0;i<len;i++){
            char c = chars[i];
            int p = c-'a';
            if(indexs[p]!=-1)   flag = Math.max(flag,indexs[p]+1);
            res = Math.max(res,i-flag+1);
            indexs[p] = i;
        }
        return res;
    }
}
