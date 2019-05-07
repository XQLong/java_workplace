package Java_Exercises.Trie_Tree;
import java.util.*;
public class Solution{
    public static class Tree{
        int usetimes = 0;   //节点被使用次数
        int isTries = 0;    //以该节点为结尾的单词个数
        HashMap<String,Tree> children = new HashMap<String,Tree>();
    }
    public static void prefix(String[] args){
        Tree head = new Tree();
        Fun fun = new Fun();
        Scanner sca = new Scanner(System.in);
        int num = sca.nextInt();
        ArrayList<String> words = new ArrayList<String>();
        ArrayList<String> checks = new ArrayList<String>();
        for(int i=0;i<num;i++){
            words.add(sca.next());
        }
        int snum = sca.nextInt();
        for(int i=0;i<snum;i++){
            checks.add(sca.next());
        }
        for(String w:words){
            fun.insertNode(w,head);
        }
        for(String c:checks){
            System.out.println(fun.getPrefixNum(c,head));
        }
    }
    public static class Fun{
        public void insertNode(String word,Tree head){
            Tree cur = head;
            if(word!=null&&word.length()>0){
                char[] chars = word.toCharArray();
                for(char c:chars){
                    String str = String.valueOf(c);
                    if(str!=null&&!cur.children.containsKey(str)){
                        cur.children.put(str,new Tree());
                    }
                    cur = cur.children.get(str);
                    cur.usetimes += 1;
                }
                cur.isTries += 1;
            }
        }

        /*public int searchWord(String word,Tree head){
            Tree cur = head;
            int n = 0;
            char[] chars = word.toCharArray();
            for(char c:chars){
                String str = String.valueOf(c);
                if(cur.children.containsKey(str)){
                    cur = cur.children.get(str);
                }else{
                    return n;
                }
            }
            return getwordNum(cur);
        }

        public int getwordNum(Tree head){
            Stack<Tree> stack = new Stack<Tree>();
            int num = 0;
            Tree node = head;
            stack.push(node);
            while(stack!=null&&!stack.isEmpty()){
                node = stack.pop();
                if(node.isTries>0)
                    num += node.isTries;
                Set<String> chs = node.children.keySet();
                for(String ch:chs){
                    stack.push(node.children.get(ch));
                }
            }
            return num;
        }*/
        public int getPrefixNum(String prefix,Tree head){
            Tree node = head;
            int num = 0;
            if(prefix!=null&&prefix.length()>0){
                char[] chars = prefix.toCharArray();
                for (char c:chars ){
                    String str = String.valueOf(c);
                    if(!node.children.containsKey(str)){
                        return 0;
                    }else {
                        node = node.children.get(str);
                    }
                }
                num = node.usetimes;
            }
            return num;
        }
    }
}