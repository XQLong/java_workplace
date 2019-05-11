package Sword2Offer.PrintCharDictionary_38;

import java.util.ArrayList;
import java.util.LinkedHashSet;

/**
 * Created by xql on 2019/5/7.
 */
public class PrintCharDictionary {
    /*方法1***********************************************************************************/
    //  使用hash来避免字符串重复
    LinkedHashSet<String> res = new LinkedHashSet<>();
    public ArrayList<String> Permutation(String str) {
        char[] arr = str.toCharArray();
        SwapcCharArr(arr,0,0);
        return new ArrayList<String>(res);
    }

    //递归所有的排序可能
    public void SwapcCharArr(char[] arr,int i,int j){
        int l = arr.length;
        if(arr.length>0) res.add(Char2String(arr));
        if(i>=l) return;
        while (j<l){
            char[] chars = arr.clone();
            if(i!=j){
                chars = swap(chars,i,j);
            }
            SwapcCharArr(chars,i+1,i+1);
            j++;
        }
    }
    //交换第i个字符移动到第j个，并保持其他字符先后顺序不变
    public char[] swap(char[] chars,int i,int j){
        int len = chars.length;
        char[] c = new char[len];
        for (int k=0;k<len;k++){
            if(k<i||k>j){
                c[k] = chars[k];
            }else if(k==i){
                c[k] = chars[j];
            }else {
                c[k] = chars[k-1];
            }
        }
        return c;
    }
    public String Char2String(char[] arr){
        String str = "";
        for (int i=0;i<arr.length;i++){
            str += arr[i];
        }
        return str==""?null:str;
    }

    /*方法2***********************************************************************************/
    ArrayList<String> list = new ArrayList<>();
    public ArrayList<String> Permutation1(String str) {
        traverse(str,0);
        return list;
    }
    public void traverse(String str,int i){
        ArrayList<String> teamp = new ArrayList<>(); //保存前面已选取的字符避免重复
        int j = i;
        while (j<str.length()){
            if(teamp.contains(str.substring(j,j+1))){
                j++;
                continue;
            }
            teamp.add(str.substring(j,j+1));
            String newstr = strswap(str,i,j);
            if(i==str.length()-1) {
                list.add(newstr);
                //System.out.println("i:"+i+"        "+newstr);
            }
            traverse(newstr,i+1);
            j++;
        }
    }
    //交换字符串的第i个与第j个并保持其他字符顺序不变
    public String strswap(String str,int i,int j){
        if(i==j) return str;
        String s1 = str.substring(0,i);
        String s2 = str.substring(i,i+1);
        String s3 = str.substring(i+1,j);
        String s4 = str.substring(j,j+1);
        String s5 = str.substring(j+1,str.length());
        return s1+s4+s2+s3+s5;
    }
}
