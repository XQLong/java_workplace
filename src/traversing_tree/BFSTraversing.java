package traversing_tree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;

/**
 * Created by xql on 2018/9/15.
 * 广度优先遍历树结构
 */
public class BFSTraversing {
    public void bfs(Tree head){
        Deque<Tree> treeDeque = new ArrayDeque<Tree>();
        /**
         * Deque双端队列也可以当做栈使用，先进后出
         */
        Pubfun pubfun = new Pubfun();
        Tree node = head;
        treeDeque.offer(node);
        while (!treeDeque.isEmpty()){
            //node = treeDeque.pop();
            node = treeDeque.poll();
            System.out.println(node.nodename);
            ArrayList<Tree> children = pubfun.getchildrenNode(node);
            if (children!=null&&!children.isEmpty()){
                for (Tree t:children){
                    //treeDeque.push(t);
                    treeDeque.offer(t);
                }
            }
        }
    }
}
