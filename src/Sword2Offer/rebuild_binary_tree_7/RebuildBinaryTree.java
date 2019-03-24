package Sword2Offer.rebuild_binary_tree_7;

import Sword2Offer.TestInstance.TreeNode;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by xql on 2019/3/24.
 */
public class RebuildBinaryTree {
    public TreeNode reConstructBinaryTree(int[] pre, int[] in) {

        return null;
    }
    public TreeNode reConstruct(int[] pre,int l,int r,int midIndex){
        int lsize = midIndex-1;

        return null;
    }
    public Map<Integer,Integer> valIndexIn(int[] in){
        Map<Integer,Integer> map = new HashMap<Integer, Integer>();
        for (int i=0;i<in.length;i++){
            map.put(in[i],i);
        }
        return map;
    }
}
