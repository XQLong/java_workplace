package Sword2Offer.ReverseString_58;

/**
 * @Author: xql
 * @Date: Created in 16:06 2019/6/27
 */
public class ReverseWords {
    public String ReverseSentence(String str) {
        String res = "";
        String[] arr = str.split(" ");
        int len = arr.length;
        if(len<=1) return str;
        for (int i=len-1;i>=0;i--){
            if(i!=len-1) arr[i] =" "+arr[i];
            res += arr[i];
        }
        return res;
    }
    //若题目改为字符数组输入，且不能利用额外空间
    /*
    * 则可以利用先将单词翻转，再将整个句子翻转来实现
    * */
    public String ReverseSentence1(String str) {
        String res = "";
        char[] chars = str.toCharArray();
        int len = chars.length;
        int borderl = 0;
        for(int i=0;i<len;i++){
            if(chars[i]==' ') {
                RevereseChars(chars,borderl,i-1);
                borderl = i+1;
            }
        }
        RevereseChars(chars,borderl,len-1);
        RevereseChars(chars,0,len-1);
        for(char c:chars) res += String.valueOf(c);
        return res;
    }
    public void RevereseChars(char[] input,int l,int r){
        if(l<0||l>=r) return;
        while (l<=(r+l)/2){
            swap(input,l,r);
            l++;
            r --;
        }
    }

    public void swap(char[] c, int i, int j) {
        char t = c[i];
        c[i] = c[j];
        c[j] = t;
    }
}
