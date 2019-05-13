package Algorithms.union_find;

import java.util.Scanner;

/**
 * Created by xql on 2019/5/13.
 */
public class Test {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        int N = reader.nextInt();
        UF uf = new UF(N);
        while(reader.hasNextInt()){
            int p = reader.nextInt();
            int q = reader.nextInt();
            System.out.println(p+" "+q);
            if(uf.connected(p,q)) continue;
            uf.union(p,q);
        }
        System.out.println(uf.count()+"components");
    }
}
