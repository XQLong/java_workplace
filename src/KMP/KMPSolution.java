package KMP;

import java.util.*;

/**
 * Created by Administrator on 2018/9/19.
 */
public class KMPSolution {
    public static void main(String[] args){
        Scanner sca = new Scanner(System.in);
        Fun fun = new Fun();
        int size = sca.nextInt();
        for(int i=0;i<size;i++){
            String partStr = sca.next();
            String searchStr = sca.next();
            int[] pmt = fun.getNext(partStr);
            System.out.println(fun.matchPart(searchStr,partStr,pmt));
        }
    }
    public static class Fun {
        public int[] getNext(String model){
            String s = model;
            int slen = s.length();
            int[] next =new int[slen];
            next[0] = 0;
            int ind = 0;//当前比较的位置
            int len = 0;
            for(int i = 1;i<slen;i++){
                while (s.charAt(i)!=s.charAt(ind)&&ind>0){
                    ind = next[ind];
                    len = 0;
                }
                if(s.charAt(i)==s.charAt(ind)){
                    len += 1;
                    next[i] = len;
                }else {
                    next[i] = 0;
                }
                ind = next[i];
            }
            return next;
        }
        public int matchPart(String searchStr, String modelStr,int[] pmt) {
            int searchSize = searchStr.length()-1;
            int modelSize = modelStr.length()-1;
            int matchNum = 0;
            int j = 0;
            int i=0;
            while (i<=searchSize){
                char c1 = searchStr.charAt(i);
                char c2 = modelStr.charAt(j);
                if(c1==c2){
                    if(j == modelSize){
                        matchNum++;
                        j = pmt[j]-1;
                    }
                    j++;
                }else {
                    j = pmt[j];
                }
                i++;
            }
            return matchNum;
        }
    }
}