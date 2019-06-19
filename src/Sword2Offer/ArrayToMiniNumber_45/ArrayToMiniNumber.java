package Sword2Offer.ArrayToMiniNumber_45;


import java.math.BigInteger;

public class ArrayToMiniNumber {
    public String PrintMinNumber(int [] numbers) {
        String res = "";
        int len = numbers.length;
        int[] order =  new int[len];
        for(int i=0;i<len;i++){
            for(int j=i+1;j<len;j++){
                String i_j = String.valueOf(numbers[i])+String.valueOf(numbers[j]);
                String j_i = String.valueOf(numbers[j])+String.valueOf(numbers[i]);
                if(Long.valueOf(i_j)>=Long.valueOf(j_i)){
                    order[i]++;
                }else if(Long.valueOf(i_j)<Long.valueOf(j_i)){
                    order[j]++;
                }
            }
        }
        for(int k=0;k<len;k++){
            res += numbers[order[k]];
        }
        return res;
    }
}
