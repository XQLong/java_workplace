package Sword2Offer.FirstNotRepeatChar_50;

import java.util.BitSet;

public class FirstNotRepeatChar {
    //使用整型数组来存储字符出现的次数
    public int FirstNotRepeatingChar(String str) {
        int[] times = new int[256];     //存储ASCII码中256字符的出现次数
        char[] chars = str.toCharArray();
        for (char c:chars) times[c]++;
        for (int i=0;i<chars.length;i++){
            if(times[chars[i]]==1) return i;
        }
        return -1;
    }
    //使用两bit位来保存次数信息
    public int FirstNotRepeatingChar1(String str){
        char[] chars = str.toCharArray();
        BitSet b1 = new BitSet(256);        //是否第一次出现
        BitSet b2 = new BitSet(256);        //是否出现了多次
        for (char c:chars){
            if(!b1.get(c)&&!b2.get(c)){
                b1.set(c);
            }
            else if(b1.get(c)&&!b2.get(c)){
                b2.set(c);
            }
        }
        for (int i=0;i<chars.length;i++){
            if(b1.get(chars[i])&&!b2.get(chars[i])) return i;
        }
        return -1;
    }
}
