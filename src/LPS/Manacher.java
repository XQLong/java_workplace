package LPS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import static java.lang.Math.min;

/**
 * Created by xql on 2018/10/15.
 * Manacher算法求解字符串的最大回文子字符串问题
 */
public class Manacher {
    public String pre_deal(String s){
        StringBuffer res = new StringBuffer();
        res.append("#");
        char[] chars = s.toCharArray();
        for(char c:chars){
            res.append("#");
            res.append(c);
        }
        res.append("#");
        return res.toString();
    }
    public int fun_manacher(String s){
        System.out.println(s);
        int res = 0;    //结果
        int[] pl = new int[s.length()+1];
        pl[0] = 0;
        pl[1] = 1;
        int id = 1;     // 当前最大回文子串的中心位置
        int mx = 1;    //当前最大回文子串的右边界
        char[] chars = s.toCharArray();
        for(int i=1,len = s.length();i<len;i++){
            pl[i] = mx>i?min(mx-i,pl[2*id-i]):1;
            while(((i-pl[i])>0&&(i+pl[i])<len)&&chars[i-pl[i]]==chars[i+pl[i]]){
                pl[i]++;
            }
            if(res<=pl[i]){
                res = pl[i];
                id = i;
                mx = id + pl[id]-1;
            }
        }
        System.out.println(res-1);
        return res-1;
    }
    public static void main(String[] args) throws IOException {
        Manacher manacher = new Manacher();
        BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(scanner.readLine());
        for(int i=0;i<num;i++){
            String s = scanner.readLine();
            s = manacher.pre_deal(s);
            manacher.fun_manacher(s);
        }
    }
}
