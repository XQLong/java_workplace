package Sword2Offer.regular_expression_19;

/**
 * Created by xql on 2019/3/27.
 */
public class RegularExpression {
    public boolean match(char[] str, char[] pattern)
    {
        int ls = str.length; int lp = pattern.length;
        char[] newpattern = new char[ls];
        if(pattern[0]=='*') return false;
        for(int i=0;i<lp;i++){
            if(pattern[i]!='.'&&pattern[i+1]!='*'){
                if(pattern[i] != str[i]) return false;
                newpattern[i] = str[i];
            }else if(pattern[i]=='.'){
                newpattern[i] = str[i];
            }else if(pattern[i]!='.'&&pattern[i+1]=='*'){
                if(pattern[i] != str[i]) newpattern[i] = pattern[i+1];
            }
        }
        return false;
    }
    public char[][] buildnewpattern(char[] pattren,int ind,boolean is){
        int l =pattren.length;
        char[][] newpattern = new char[2][l];
        //如果*前字母相等，则去掉*并添加其前面的字母
        if(is){
            for (int i=0;i<l;i++){
                if(i>=(ind-1)&&(i+2)<l){
                    newpattern[1][i] = pattren[i+2];
                }
                if(i>=ind){
                    newpattern[1][i] = pattren[i-1];
                }else {
                    newpattern[1][i] = pattren[i];
                }
            }
        }
        //如果*前字母不相等，则去掉*及其前面的字母
        else {
            for (int i=0;i<l;i++){
                if(i>=(ind-1)&&(i+2)<l){
                    newpattern[1][i] = pattren[i+2];
                }
                newpattern[1][i] = pattren[i];
            }
        }
    }
}
