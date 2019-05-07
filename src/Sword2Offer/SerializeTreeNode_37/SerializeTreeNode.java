package Sword2Offer.SerializeTreeNode_37;

import Sword2Offer.TestInstance.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by xql on 2019/5/6.
 */
public class SerializeTreeNode {
    // 使用层次遍历，对所有空节点使用#填充
    public String res = "";
    public String Serialize(TreeNode root) {
        TreverseTree(root);
        return res;
    }
    public TreeNode Deserialize(String str) {
        int ind0 = 0,ind1 = 1,ind2 = 2;
        String[] arrStr = str.split("-");
        String s = "#";
        int len = arrStr.length;
        ArrayList<TreeNode> list = new ArrayList<>();
        for (int i=0;i<len;i++){
            String c = arrStr[i];
            TreeNode t = !c.equals(s)?new TreeNode(Integer.valueOf(c)):null;
            list.add(t);
        }
        while (ind0<len&&ind2<len){
            TreeNode t = list.get(ind0);
            TreeNode l = list.get(ind1);
            TreeNode r = list.get(ind2);
            if(t!=null){
                t.left = l;
                t.right = r;
            }
            ind0++;
            ind1 = ind0*2+1;
            ind2 = ind1+1;
        }
        return list.get(0);
    }

    public void TreverseTree(TreeNode pHead){
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(pHead);
        int cnt = 0;
        int nullnum = 0;    //每行中为空的节点个数
        String s = "";
        while (!queue.isEmpty()){
            cnt = queue.size();
            if(cnt==2*nullnum) break;
            nullnum = 0;
            while (cnt>0){
                TreeNode t = queue.poll();
                s = t==null?"#":String.valueOf(t.val);
                res += s;
                res += "-";
                if(t!=null){
                    queue.offer(t.left);
                    queue.offer(t.right);
                }else {
                    nullnum++;
                    queue.offer(null);
                    queue.offer(null);
                }
                cnt--;
            }
        }
    }
    /**********************************************************************************************************/
    // 使用前序遍历
    public String res1 = "";
    public TreeNode ret = null;
    int ind = 0;
    public String Serialize1(TreeNode root) {
        preTraverse1(root);
        return res1;
    }
    public TreeNode Deserialize1(String str) {
        String[] arr = str.split("-");
        int len = arr.length;
        String s = "#";
        if(arr[0].equals(s)) return null;
        TreeNode head =new TreeNode(Integer.valueOf(arr[0]));
        ret =head;
        TreeBack(head,arr,s);
        return ret;
    }
    public void TreeBack(TreeNode cur,String[] arr,String s) {
        ind++;
        if(cur == null) return;
        TreeNode t = null;
        if(!arr[ind].equals(s)){
            t = new TreeNode(Integer.valueOf(arr[ind]));
        }
        cur.left = t;
        TreeBack(cur.left,arr,s);
        t = null;
        if(!arr[ind].equals(s)){
            t = new TreeNode(Integer.valueOf(arr[ind]));
        }
        cur.right = t;
        TreeBack(cur.right,arr,s);
    }
    public void preTraverse1(TreeNode root){
        if(root==null) {
            res1 += "#-";
            return;
        }
        String s = String.valueOf(root.val)+"-";
        res1 += s;
        preTraverse1(root.left);
        preTraverse1(root.right);
    }

}
