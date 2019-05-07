package Java_Exercises.traversing_tree;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Administrator on 2018/9/15.
 */
public class BuildTree {
    public static void main(String[] args){
        Tree head = new Tree();
        DFSTraversing dfsTraversing = new DFSTraversing();
        BFSTraversing bfsTraversing = new BFSTraversing();
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> str = new ArrayList<String>();
        int num = scanner.nextInt();
        for (int i= 0;i<num;i++){
            str.add(scanner.next());
        }
        for (String s:str){
            insertNode(s,head);
            System.out.println(s);
        }
        System.out.println("head nodename:"+head.nodename);
        //dfsTraversing.dfs(head);
        bfsTraversing.bfs(head);
    }

    /**
     * 构造前缀树，向树中插入节点
     * @param s
     * @param head
     */
    public static void insertNode(String s, Tree head){
        char chars[] = s.toCharArray();
        Tree cur = head;
        for (char c:chars){
            if(!cur.children.containsKey(c)){
                    cur.children.put(c,new Tree());
                    cur.children.get(c).nodename = c;
                    System.out.println("向词典中加入字母："+c);
            }
            cur = cur.children.get(c);
        }
        cur.isTrie = true;
    }
}
