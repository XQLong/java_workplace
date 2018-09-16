package Trie_Tree;

/**
 * Created by Administrator on 2018/9/14.
 */

import java.util.HashMap;

/**
 * 定义前缀树
 */
public class Tries {
    Boolean istrie = false;
    HashMap<Character,Tries> children = new HashMap<Character,Tries>();
}
