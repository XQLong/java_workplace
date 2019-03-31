package Sword2Offer.pathInmatrix_12;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xql on 2019/3/30.
 */
public class PathInMatrix {
    public boolean hasPath(char[] matrix, int rows, int cols, char[] str)
    {
        if(matrix.length==0||str.length==0||matrix.length<str.length) return false;
        for (int i=0;i<matrix.length;i++){
            /*
            * 以矩阵的第i个元素开始寻找路径
            * path用来保存路径*/
            List<Integer> path = new ArrayList<Integer>();
            boolean res = nextPath(matrix,rows,cols,i,str,0,path);
            System.out.println(path);
            if(res) return true;
        }
        return false;
    }
    public boolean nextPath(char[] arr,int rows,int cols,int p,char[] str,int inds,List<Integer> path){
        int len = str.length;
        path.add(Integer.valueOf(p));
        if(arr[p]!=str[inds]||p>=arr.length) {
            path.remove(Integer.valueOf(p));
            return false;
        }
        //递归终止条件str字符串遍历完成
        if(inds == len-1) return true;
        //左
        return (!path.contains(p-1)) && (p % cols) > 0 && nextPath(arr, rows, cols, p - 1, str, inds + 1,path)
        //右
        ||(!path.contains(p+1)) && (p % cols) < (cols - 1) && nextPath(arr, rows, cols, p + 1, str, inds + 1,path)
        //上
        || (!path.contains(p-cols)) && p > (cols - 1) && nextPath(arr, rows, cols, p - cols, str, inds + 1,path)
        //下
        ||(!path.contains(p+cols)) && p < (arr.length - cols) && nextPath(arr, rows, cols, p + cols, str, inds + 1,path);
    }
}
