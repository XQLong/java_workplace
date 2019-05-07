package Java_Exercises.KMP;

import java.util.*;

/**
 * Created by xql on 2018/9/18.
 * 求取模式串的部分匹配表
 */
public class PrefixArray {
    public List<Integer> getPrefixArray(String modelStr){
        List<Integer> preMap = new ArrayList<Integer>();
        String str = modelStr;
        char[] chars = str.toCharArray();
        int modelSize = chars.length;
        for (int i=1;i<=modelSize;i++){
            String preStr = str.substring(0,i);
            //求取该字符对应相同前后缀的最大长度
            Integer num = getLength(preStr);
            preMap.add(num);
        }
        List<Integer> pmt  = new  ArrayList<Integer>();
        for(int  j=0;j<preMap.size();j++){
            if(j==0){
                pmt.add(1);
            }else {
                pmt.add(j-preMap.get(j));
            }
        }
        return pmt;
    }

    /**
     * 求取该字符对应相同前后缀的最大长度
     * @param model
     * @return
     */
    public Integer getLength(String model){
        String str = model;
        int len = str.length();
        int num = 0;
        if(len>1){
            for ( int i =len-1;i>0;i--){
                if(str.substring(0,i).equals(str.substring(len-i,len))){
                    num = i;
                    break;
                }
            }
        }
        return num;
    }
    public int matchPart(String searchStr,String partStr,List<Integer> pmt){
        List<Integer> list = pmt;
        int slen = searchStr.length()-1;
        int plen = partStr.length()-1;
        if(plen<0||slen<plen)
            return 0;
        int matchNum = 0;
        for(int j = 0;j<=(slen-plen);j++){
            for(int i =0;i<=plen;i++){
                String s = String.valueOf(searchStr.charAt(j+i));
                String m = String.valueOf(partStr.charAt(i));
                if(!s.equals(m)){
                    j =j+ list.get(i)-1;
                    break;
                }
                if(i==plen&&s.equals(m)){
                    matchNum += 1;
                }
            }
        }
        System.out.println(matchNum);
        return matchNum;
    }
}
