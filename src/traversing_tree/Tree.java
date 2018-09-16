package traversing_tree;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2018/9/15.
 */
public class Tree {
    boolean isTrie = false;
    HashMap<Character,Tree> children = new HashMap<Character,Tree>();
}
