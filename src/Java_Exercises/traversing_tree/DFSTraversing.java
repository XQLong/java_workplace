package Java_Exercises.traversing_tree;

import java.util.*;

/**
 * Created by xql on 2018/9/15.
 * 深度优先遍历树结构
 */
public class DFSTraversing {
    /**
     * 利用栈的先进后出特点实现深度优先遍历
     * @param head
     */
    public void dfs(Tree head){
        Stack<Tree> stack = new Stack<Tree>();
        Pubfun pubfun = new Pubfun();
        stack.push(head);
        while (!stack.isEmpty()){
            Tree node = stack.pop();
            System.out.println(node.nodename);
            ArrayList<Tree> children = pubfun.getchildrenNode(node);
            if(children!=null&&!children.isEmpty()){
                for (Tree t:children){
                    stack.push(t);
                }
            }
        }
    }
}
