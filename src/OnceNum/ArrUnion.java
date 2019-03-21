package OnceNum;

import java.util.Arrays;

/**
 * Created by xql on 2019/2/28.
 */
public class ArrUnion {
    static void swap(int a,int b)
    {
        a=a^b;
        b=b^a;
        a=a^b;
        System.out.println(a+"  "+b);
    }
    public void merge(int[] nums1, int m, int[] nums2, int n) {
    }

    public static void main(String[] args){
        swap(4,8);
    }
}
