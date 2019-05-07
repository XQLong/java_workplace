package Java_Exercises.cross_add;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by xql on 2018/11/19.
 */
public class cross_add {
    public static void main(String args[]) throws IOException {
        BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in));
        String data =scanner.readLine();
        String[] num = data.split(" ");
        int ans = 0;
        int l = Integer.valueOf(num[0]);
        int r = Integer.valueOf(num[1]);
        int v = Integer.valueOf(num[2]);
        for (int i = l;i <= r;i++){
            if(v==add(i)){
                ans += i;
            }
        }
        System.out.println(ans%1000000000);
    }
    public static int add(int a){
        double ans = 0;
        String num = String.valueOf(a);
        char[] c = num.toCharArray();
        for (int i=0;i<c.length;i++){
            int d = c[i]-'0';
            ans += Math.pow(-1,i)*d;
        }
        return (new Double(ans).intValue());
    }
}
