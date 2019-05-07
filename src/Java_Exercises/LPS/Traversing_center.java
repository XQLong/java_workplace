package Java_Exercises.LPS;

import java.util.Scanner;

/**
 * Created by Administrator on 2018/10/15.
 */
public class Traversing_center {
    public int LongestPalindrome(String s){
        char[] chars = s.toCharArray();
        int[] len = new int[chars.length];
        int res = 0;
        for(int i=0;i<chars.length;i++){
            for(int j=1;i-j>=0&&i+j<chars.length;j++){
                if(chars[i-j]!=chars[i+j])
                    break;
                len[i] = 2*j+1;
            }
            if(res<len[i])
                res = len[i];
        }
        System.out.println(res);
        return res;
    }
    public static void main(String[] args){
        Traversing_center t = new Traversing_center();
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        for(int i=0;i<num&&scanner.hasNext();i++){
            String s = scanner.next();
            t.LongestPalindrome(s);
        }

    }
}
