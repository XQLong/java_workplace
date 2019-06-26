package Sword2Offer.DeepOfBinaryTree_55;

import Java_Exercises.traversing_tree.Tree;
import Sword2Offer.TestInstance.TreeNode;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * @Author:xql
 * @Date:Created in 15:39 2019/6/26
 */
public class DeepOfBinaryTree {
    int deep = 0;
    public int TreeDepth(TreeNode root) {
        //LevelTravel(root);
        preTravel(root,0);
        return deep;
    }
    //直接递归求深度
    public int getDeep(TreeNode node){
        //每次求取在节点左子树和右子树中深度较大者
        return node==null?0:1+Math.max(getDeep(node.left),getDeep(node.right));
    }
    //层次遍历求深度
    public void LevelTravel(TreeNode node){
        Queue<TreeNode> queue =new LinkedList<>();
        if(node==null) return;
        queue.add(node);
        while (!queue.isEmpty()){
            this.deep++;
            int cnt = queue.size();
            while (cnt>0){
                TreeNode cur = queue.poll();
                if(cur.left!=null)  queue.add(cur.left);
                if(cur.right!=null)  queue.add(cur.right);
                cnt--;
            }
        }
    }
    //先序遍历求深度
    public void preTravel(TreeNode node,int cnt){
        if(node!=null){
            cnt++;
        } else {
            cnt--;
            return;
        }
        deep = Math.max(deep,cnt);
        preTravel(node.left,cnt);
        preTravel(node.right,cnt);
    }

}
