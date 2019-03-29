package Sword2Offer.regular_expression_19;

/**
 * Created by xql on 2019/3/27.
 */
public class RegularExpression {
    public boolean match(char[] str, char[] pattern) {
        return matchpattern(str, pattern, 0, 0);
    }

    public boolean matchpattern(char[] str, char[] pattren, int indstr, int indpattern) {
        int ls = str.length - 1;
        int lp = pattren.length - 1;
        if(indstr==(ls+1)&&indpattern==(lp+1)) return true;
        if(indpattern>lp) return false;
        if(indstr<=ls&&indpattern<=lp){
            if(indpattern<lp&&pattren[indpattern+1]=='*'){
                if(pattren[indpattern]=='.'||str[indstr]==pattren[indpattern]){
                    return (matchpattern(str, pattren, indstr, indpattern+2)
                            ||matchpattern(str, pattren, indstr+1, indpattern+2)
                            ||matchpattern(str, pattren, indstr+1, indpattern));
                }else if(str[indstr]!=pattren[indpattern]&&pattren[indpattern]!='.'){
                    return matchpattern(str, pattren, indstr, indpattern+2);
                }
            }else if(indpattern<lp&&pattren[indpattern+1]!='*'){
                if(pattren[indpattern]=='.'||str[indstr]==pattren[indpattern]){
                    return matchpattern(str,pattren,indstr+1,indpattern+1);
                }else if(str[indstr]!=pattren[indpattern]&&str[indstr]!='.'){
                    return false;
                }
            }else if(indpattern==lp){
                if(str[indstr]==pattren[indpattern]||pattren[indpattern]=='.') return matchpattern(str, pattren, indstr+1, indpattern+1);
            }
        }else if(indstr == ls +1){
            return matchpattern(str, pattren, indstr, indpattern+2);
        }
        return false;
    }

}
