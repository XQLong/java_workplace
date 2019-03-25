package Sword2Offer;

import Sword2Offer.TestInstance.ListNode;
import Sword2Offer.TestInstance.TreeNode;
import Sword2Offer.printlistfromTrail2Head_6.PrintListFromT2H;
import Sword2Offer.rebuild_binary_tree_7.RebuildBinaryTree;
import Sword2Offer.repetitive_num_arr_3.Repetitivenum_arr;
import Sword2Offer.replace_blank_5.Replaceblank;
import Sword2Offer.search_in_2arr_4.Findnuminarr;

import java.util.ArrayList;
import java.util.Stack;

/**
 * Created by xql on 2019/3/21.
 */
public class solution {
    public static void main(String args[]){
        //3
/*        Repetitivenum_arr repetitivenum_arr = new Repetitivenum_arr();
        int test[] = {0,1,3,5,5,4,5,3};
        repetitivenum_arr.searchnum(test);*/

        //4
/*        int[][] arr = {{1,2,8,9},{2,4,9,12},{4,7,10,13},{6,8,11,15}};
        int target = 7;
        Findnuminarr findnuminarr = new Findnuminarr();
        System.out.println(findnuminarr.findnum(target,arr));*/

        //5
/*        StringBuffer stringBuffer = new StringBuffer("asf hgfds  gfd");
        Replaceblank replaceblank = new Replaceblank();
        System.out.print(replaceblank.replaceSpace(stringBuffer));*/

        //6
        /*ListNode listNode = new ListNode(1);
        ListNode listNode1 = new ListNode(3);
        ListNode listNode2 = new ListNode(7);
        listNode.addnode(listNode1);
        listNode.addnode(listNode2);
        while (listNode!=null){
            listNode.printnode();
            listNode = listNode.next;
        }
        PrintListFromT2H pr = new PrintListFromT2H();
        ArrayList<Integer> ret = pr.printListFromTailToHead3(listNode);
        for (int a:ret){
            System.out.println(a);
        }*/

        //7
        int[] pre = {1,2,4,7,3,5,6,8};
        int[] in = {4,7,2,1,5,3,8,6};
        RebuildBinaryTree reB = new RebuildBinaryTree();
        TreeNode treeNode = reB.reConstructBinaryTree(pre,in);
        Stack<TreeNode> stack = new Stack<>();
        solution s = new solution();
        stack = s.addTreeNode(stack,treeNode);
        while (!stack.isEmpty()){
            stack.pop().printval();
        }
    }
        public Stack<TreeNode> addTreeNode(Stack<TreeNode> stack,TreeNode t){
            if (t!=null){
                stack.add(t);
                if(t.left!=null) addTreeNode(stack,t.left);
                if(t.right!=null) addTreeNode(stack,t.right);
            }
            return stack;
        }
}
