package Java_Exercises.union_find;

import java.util.Scanner;

/**
 * Created by xql on 2018/12/17.
 */
public class UF {
    private int[] id;   //分量id（以触点为索引）
    private int count;  //分量数量
    public UF(int N){
        //初始化分量id数组
        count = N;
        id = new int[N];
        for (int i=0;i<N;i++)
            id[i] = i;
    }
    public int count(){
        return count;
    }
    public boolean connected(int p,int q){
        return find(p) == find(q);
    }
    public int find(int p){return id[p];}
    //quick find
    public void union(int p,int q){
        //将p和q归并到相同的分量中

        int pID = find(p);
        int qID = find(q);
        //如果p和q已经在相同的分量之中则不需要采取任何行动
        if(pID == qID) return;
        //将p的分量重命名为q的名称
        for(int i = 0;i<id.length;i++){
            if(id[i]==pID) id[i] = qID;
        }
        count--;
    }
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
