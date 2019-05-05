package Sword2Offer.BinaryTreeSumTrace_34;

import Sword2Offer.TestInstance.TreeNode;

import java.util.ArrayList;

/**
 * Created by xql on 2019/4/30.
 */
public class BinaryTreeSunTrace {
    ArrayList<ArrayList<Integer>> res = new ArrayList<>();
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
        ArrayList<Integer> arr = new ArrayList<>();
        findTrace(root,target,0,arr);
        return res;
    }
    public void findTrace(TreeNode root, int target,int presum,ArrayList<Integer> prepath){
        if(root==null) return;
        int sum = presum + root.val;
        ArrayList<Integer> temp = new ArrayList<>(prepath);     //创建新的ArrayList，保证每次回溯到上一层
        if(sum <= target) {
            temp.add(root.val);
            if(sum==target&&root.right==null&&root.left==null){
                res.add(temp);
            }else {
                findTrace(root.left,target,sum,temp);
                findTrace(root.right,target,sum,temp);
            }
        }
    }
}
