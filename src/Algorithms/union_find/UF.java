package Algorithms.union_find;

/**
 * Created by xql on 2018/12/17.
 */
public class UF {
    /*********************quick find 算法******************************************************************/
    public class Quick_Find{
        private int[] id;   //分量id（以触点为索引）
        private int count;  //分量数量
        public Quick_Find(int N){
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

        //将p和q归并到相同的分量中
        public void union(int p,int q){
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
    }
    public Quick_Find quick_find(int N){
        Quick_Find qf = new Quick_Find(N);
        return qf;
    }
    /*********************quick union 算法******************************************************************/
    public class Quick_Union{
        private int[] id;   //分量id（以触点为索引）
        private int count;  //分量数量
        public Quick_Union(int N){
            //初始化分量id数组
            count = N;
            id = new int[N];
            for (int i=0;i<N;i++)
                id[i] = i;
        }
        public int count(){
            return count;
        }
        //搜寻节点的根节点
        public int root(int i){
            while (i!=id[i])   i=id[i];
            return i;
        }
        //将p节点进行归并到q节点中
        public void union(int p,int q){
            int rootp = root(p);
            int rootq = root(q);
            id[rootp] = rootq;
            count--;
        }
        //
        public boolean connected(int p,int q){
            return root(p) == root(q);
        }
    }
    public Quick_Union quick_union(int N){
        Quick_Union qu = new Quick_Union(N);
        return qu;
    }
    /*********************quick union 算法改进******************************************************************/
    public class Quick_Union_Pro{
        private int[] id;   //分量id（以触点为索引）
        private int count;  //分量数量
        protected int[] weight;   //节点权重
        public Quick_Union_Pro(int N){
            //初始化分量id数组
            count = N;
            id = new int[N];
            weight = new int[N];
            for (int i=0;i<N;i++){
                weight[i] = 1;
                id[i] = i;
            }
        }
        public int count(){
            return count;
        }
        //搜寻节点的根节点
        public int root(int i){
            int node = i;
            while (node!=id[node])   node=id[node];
            /*改进2：路径压缩，在搜寻root时将该节点指向root*/
            // id[i] = node;
            return node;
        }
        //对p节点和节点q进行带权归并
        public void union(int p,int q){
            int rootp = root(p);
            int rootq = root(q);
            if(weight[p]>weight[q]){
                id[rootq] = rootp;
                weight[rootp] += weight[rootq];
            }else {
                id[rootp] = rootq;
                weight[rootq] += weight[rootp];
            }
            count--;
        }
        //
        public boolean connected(int p,int q){
            return root(p) == root(q);
        }
    }
    public Quick_Union_Pro quick_union_pro(int N){
        Quick_Union_Pro qup = new Quick_Union_Pro(N);
        return qup;
    }
}
