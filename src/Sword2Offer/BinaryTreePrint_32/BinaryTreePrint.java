package Sword2Offer.BinaryTreePrint_32;

import Sword2Offer.TestInstance.TreeNode;

import java.util.*;

/**
 * Created by xql on 2019/4/26.
 */
public class BinaryTreePrint {
    // 从上往下打印二叉树(层次遍历)
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList<Integer> arr = new ArrayList<>();
        if(root==null) return arr;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while (!q.isEmpty()){
            TreeNode t = q.poll();
            arr.add(t.val);
            System.out.println(t.val);
            if(t.left!=null) q.offer(t.left);
            if(t.right!=null) q.offer(t.right);
        }
        return arr;
    }

    // 前序遍历
    public void preOrderTraversel(TreeNode root){
        if(root!=null){
            System.out.println(root.val);
            preOrderTraversel(root.left);
            preOrderTraversel(root.right);
        }
    }

    //中序遍历
    public void midOrderTraversel(TreeNode root){
        if(root!=null){
            midOrderTraversel(root.left);
            System.out.println(root.val);
            midOrderTraversel(root.right);
        }
    }

    //后续遍历
    public void postOrderTraversel(TreeNode root){
        if(root!=null){
            postOrderTraversel(root.left);
            postOrderTraversel(root.right);
            System.out.println(root.val);
        }
    }

    //层次遍历(利用队列的先进先出完成)
    public void levelOrderTraversel(TreeNode root){
        Queue<TreeNode> queue = new LinkedList<>();
        if(root==null) return;
        queue.offer(root);
        while (!queue.isEmpty()){
            TreeNode node = queue.poll();
            System.out.println(node.val);
            queue.offer(node.left);
            queue.offer(node.left);
        }
    }

    //使用层次遍历，将二叉树打印成多行
    public ArrayList<ArrayList<Integer> > PrintTreeNodeN(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList();
        queue.offer(pRoot);
        while (!queue.isEmpty()){
            ArrayList<Integer> list = new ArrayList<Integer>();
            int cnt = queue.size();
            while (cnt>0){
                TreeNode node = queue.poll();
                if (node!=null){
                    list.add(node.val);
                    queue.offer(node.left);
                    queue.offer(node.right);
                }
                cnt--;
            }
            if(cnt==0&&!list.isEmpty()) arr.add(list);
        }
        return arr;
    }

    // 按之子型打印二叉树
    public ArrayList<ArrayList<Integer> > PrintTreeNodeZ(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> ret = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.offer(pRoot);
        boolean reverse = false;
        while (!q.isEmpty()){
            ArrayList<Integer> list = new ArrayList<>();
            int n = q.size();
            while (n>0){
                TreeNode treeNode = q.poll();
                if(treeNode!=null){
                    q.offer(treeNode.left);
                    q.offer(treeNode.right);
                    list.add(treeNode.val);
                }
                n--;
            }
            if(reverse){
                Collections.reverse(list);
            }
            reverse = !reverse;
            if(!list.isEmpty()) ret.add(list);
        }
        return ret;
    }

    /*二叉树的非递归遍历
    * */
    //先序遍历
    public List<Integer> preOrder(TreeNode head) {
        List<Integer> res = new ArrayList<Integer>();
        Stack<TreeNode> stack = new Stack<TreeNode>();
        if(head==null) return res;
        TreeNode cur = head;
        while (cur!=null||stack.size()>0){
            while (cur!=null){
                stack.push(cur);
                res.add(cur.val);
                cur = cur.left;
            }
            cur = stack.pop();
            cur = cur.right;
        }
        return res;
    }
    //中序遍历
    public List<Integer> inOrder(TreeNode head) {
        List<Integer> res = new ArrayList<Integer>();
        Stack<TreeNode> stack = new Stack<TreeNode>();
        if(head==null) return res;
        TreeNode cur = head;
        while(cur!=null||stack.size()>0){
            while (cur!=null){
                stack.push(cur);
                cur = cur.left;
            }
            cur = stack.pop();
            res.add(cur.val);
            cur = cur.right;
        }
        return res;
    }
    //后续遍历，使用两个栈
    public List<Integer> postOrder(TreeNode head) {
        List<Integer> res = new ArrayList<Integer>();
        if(head==null) return res;
        Stack<TreeNode> stack = new Stack<>();
        Stack<TreeNode> output = new Stack<>();
        TreeNode cur = head;
        stack.push(cur);
       while (stack.size()>0){
           cur = stack.pop();
           output.push(cur);
           if(cur.right!=null) stack.push(cur.right);
           if(cur.left!=null) stack.push(cur.left);
       }
       while (output.size()>0){
           res.add(output.pop().val);
       }
       return res;
    }
}
