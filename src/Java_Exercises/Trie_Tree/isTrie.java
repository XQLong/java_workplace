package Java_Exercises.Trie_Tree;

/**
 * Created by Administrator on 2018/9/14.
 */
public class isTrie {
    public static void main(String[] args){
        Tries head = new Tries();
        String strs[] = {"abc","abd","b","abdc"};
        for(int i=0;i<strs.length;i++){
            insertNode(strs[i],head);
        }
        search("a",head);
    }
    public static boolean insertNode(String str,Tries head){
        if(str==null||str.length()==0)
            return false;
        char chs[] = str.toCharArray();
        int i = 0;
        Tries cur = head;
        while(i<chs.length){
            if(!cur.children.containsKey(chs[i])){
                cur.children.put(chs[i],new Tries());
            }
            cur = cur.children.get(chs[i]);
            if(cur.istrie){
                System.out.println("tries tree");
                return true;
            }
            i++;
        }
        cur.istrie = true;
        if(cur.children.size()>0){
            System.out.println("trie tree");
            return true;
        }
        return false;
    }
    public static int search(String word,Tries head){
        Tries cur = head;
        String w = word;
        char chars[] = w.toCharArray();
        int n = 0;
        for (char c:chars){
            if(!cur.children.containsKey(c)){
                break;
            }else {
                cur = cur.children.get(c);
                if (cur.istrie)
                    n += 1;
            }
        }
        return 0;
    }
}
