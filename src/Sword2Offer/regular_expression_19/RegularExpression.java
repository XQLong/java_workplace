package Sword2Offer.regular_expression_19;

/**
 * Created by xql on 2019/3/27.
 */
public class RegularExpression {
    public boolean match(char[] str, char[] pattern)
    {
        return false;
    }
    public boolean matchpattern(char[] str,char[] pattren,int indstr,int indpattern){
        int ls = str.length;
        int lp = pattren.length;
        if(indstr==ls&&indpattern==lp) return true;
        if (indpattern>=lp) return false;
        if(pattren[indpattern+1]!='*'){
            if(str[indstr]==pattren[indpattern]||str[indstr]=='.'){
                matchpattern(str,pattren,indstr+1,indpattern+1);
            }else if(str[indstr]!=pattren[indpattern]&&str[indstr]!='.'){
                return false;
            }
        }else if(pattren[indpattern+1]=='*'){
            if(str[indstr]==pattren[indpattern]||str[indstr]=='.'){
                return (matchpattern(str, pattren, indstr, indpattern+2)||matchpattern(str, pattren, indstr+1, indpattern+2)||matchpattern(str, pattren, indstr+1, indpattern));
            }else if(str[indstr]!=pattren[indpattern]&&str[indstr]!='.'){
                if(str[indstr]==pattren[indpattern+2]){
                    matchpattern(str, pattren, indstr+1, indpattern+3);
                }else {
                    return false;
                }
            }
        }
        return false;
    }
}
