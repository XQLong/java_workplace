package traversing_tree;

import java.util.*;

/**
 * Created by xql on 2018/9/15.
 * 深度优先遍历树结构
 */
public class DFSTraversing {
    /**
     * 利用栈的先进后出特点实现深度优先遍历
     * @param headHashMap
     */
    public void depthFirst(HashMap<Character,Tree> headHashMap){
        Stack<HashMap<Character,Tree>> nodeStack = new Stack<HashMap<Character,Tree>>();
        HashMap<Character,Tree> node = headHashMap;
        nodeStack.push(node);
        while (!nodeStack.isEmpty()){
            node = nodeStack.pop();
            ArrayList<HashMap<Character,Tree>> children = getChildren(node);
            if(children!=null&&!children.isEmpty()){
                System.out.println(node.keySet());
                for (HashMap child:children){
                    nodeStack.push(child);
                }
            }
        }
    }

    /**
     * 获取该节点的子节点
     * @param node
     * @return
     */
    private ArrayList<HashMap<Character,Tree>> getChildren(HashMap<Character, Tree> node) {
        HashMap<Character,Tree> parent = node;
        Set<Character> set = node.keySet();
        ArrayList<HashMap<Character,Tree> >  children = new ArrayList<HashMap<Character, Tree>>() ;
        for (Character c:set){
            HashMap<Character,Tree> child = parent.get(c).children;
            children.add(child);
        }
        return children;
    }
}
