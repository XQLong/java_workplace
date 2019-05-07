package Java_Exercises.traversing_tree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/**
 * Created by Administrator on 2018/9/16.
 */
public class Pubfun {
    /**
     * 获取某个节点的子节点
     * @param node
     * @return
     */
    public ArrayList<HashMap<Character,Tree>> getchildren(HashMap<Character, Tree> node) {
        HashMap<Character,Tree> parent = node;
        Set<Character> set = node.keySet();
        ArrayList<HashMap<Character,Tree> >  children = new ArrayList<HashMap<Character, Tree>>() ;
        for (Character c:set){
            HashMap<Character,Tree> child = parent.get(c).children;
            children.add(child);
        }
        return children;
    }
    public ArrayList<Tree> getchildrenNode( Tree node) {
        Tree head = node;
        Set<Character> set = head.children.keySet();
        ArrayList<Tree>  children = new ArrayList<Tree>() ;
        for (Character c:set){
            Tree child =  head.children.get(c);
            children.add(child);
        }
        return children;
    }
}
