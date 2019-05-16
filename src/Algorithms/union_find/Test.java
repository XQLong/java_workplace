package Algorithms.union_find;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by xql on 2019/5/13.
 */
public class Test {
    //读取数据
    public ArrayList<int[]> readtxt () throws IOException {
        String dir = "E:\\java_workplace\\java_workplace\\src\\Algorithms\\union_find\\largeUF.txt";
        FileInputStream file = new FileInputStream(dir);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(file));
        ArrayList<int[]> ret =new ArrayList<>();
        String str = null;
        while ((str = bufferedReader.readLine())!=null){
            String[] strings = str.split(" ");
            int len = strings.length;
            int[] datas = new int[len];
            for(int i=0;i<len;i++){
                datas[i] = Integer.valueOf(strings[i]);
            }
            ret.add(datas);
        }
        file.close();
        bufferedReader.close();
        return ret;
    }
    public static void main(String[] args) throws IOException {
        Test test = new Test();
        ArrayList<int[]> arrayList = test.readtxt();
        int N = arrayList.get(0)[0];
        UF uf = new UF();
        UF.Quick_Find qf = uf.quick_find(N);
        UF.Quick_Union qu = uf.quick_union(N);
        UF.Quick_Union_Pro qup = uf.quick_union_pro(N);
        for(int i=1;i<arrayList.size();i++){
            int p = arrayList.get(i)[0];
            int q = arrayList.get(i)[1];
            System.out.println(p+" "+q);
            if(qup.connected(p,q)) continue;
            qup.union(p,q);
        }
        System.out.println(qup.count()+"components");
    }
}
