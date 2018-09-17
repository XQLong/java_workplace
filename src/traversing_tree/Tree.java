package traversing_tree;

import java.util.HashMap;
/**
 * Created by Administrator on 2018/9/15.
 */
public class Tree {
    Character nodename = ' ';
    boolean isTrie = false;
    HashMap<Character,Tree> children = new HashMap<Character,Tree>();
}
