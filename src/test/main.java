package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * Created by Administrator on 2018/9/28.
 */
public class main {
    public static void main(String[] args){
        int[] a = new int[] {1,2,3,4,5};
        IntStream stream = IntStream.of(a)
                .filter(n -> n%2==0)
                .map(n ->{
                    System.out.println(n);
                    return n*2;
                });
        System.out.println(stream.toArray().length);
    }
}
