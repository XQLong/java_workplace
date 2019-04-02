package Sword2Offer;

import Sword2Offer.TestInstance.TreeNode;
import Sword2Offer.cutrope_14.CutRope;
import Sword2Offer.integer_power_16.IntegerPower;
import Sword2Offer.minNumberInRotateArray_11.MinNumberInRotateArray;
import Sword2Offer.numberofone_15.NumberOfOne;
import Sword2Offer.pathInmatrix_12.PathInMatrix;
import Sword2Offer.regular_expression_19.RegularExpression;
import Sword2Offer.robotmoverange_13.RobotMoveRange;

import java.util.Stack;

/**
 * Created by xql on 2019/3/21.
 */
public class solution {
    public static void main(String args[]){
        //3
/*        Repetitivenum_arr repetitivenum_arr = new Repetitivenum_arr();
        int Regulartest[] = {0,1,3,5,5,4,5,3};
        repetitivenum_arr.searchnum(Regulartest);*/

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
        /*int[] pre = {1,2,4,7,3,5,6,8};
        int[] in = {4,7,2,1,5,3,8,6};
        RebuildBinaryTree reB = new RebuildBinaryTree();
        TreeNode treeNode = reB.reConstructBinaryTree(pre,in);
        Stack<TreeNode> stack = new Stack<>();
        solution s = new solution();
        stack = s.addTreeNode(stack,treeNode);
        while (!stack.isEmpty()){
            stack.pop().printval();
        }*/

        //8
        /*BuildQueueBy2Stark b = new BuildQueueBy2Stark();
        b.push(5);
        b.push(2);
        System.out.println(b.pop());
        b.push(0);
        System.out.println(b.pop());
        System.out.println(b.pop());*/

        //10
        /*Fibonacci fibonacci = new Fibonacci();
        System.out.print(fibonacci.fibonacci3(4));*/

        //19
        /*char[] str = {'a','a'};
        char[] str1 = {'a','a','b','a'};
        char[] str2 = {'a','a','b','a'};
        char[] str3 = {'a','c'};
        char[] str4 = {'a'};
        char[] pattern = {'a','b','*'};
        char[] pattern1 = {'a','a','.','*'};
        String s = "aaba";
        String p = "aa.*";
        RegularExpression reg = new RegularExpression();
        System.out.print(reg.match(str1,pattern1));*/

        //11
        /*int[] arr = {};
        int[] arr1 = {1};
        int[] arr2 = {2,1};
        int[] arr3 = {2,3,1};
        int[] arr4 = {5,6,8,2,3};
        MinNumberInRotateArray m = new MinNumberInRotateArray();
        System.out.println(m.minNumberInRotateArray1(arr));
        System.out.println(m.minNumberInRotateArray1(arr1));
        System.out.println(m.minNumberInRotateArray1(arr2));
        System.out.println(m.minNumberInRotateArray1(arr3));
        System.out.println(m.minNumberInRotateArray1(arr4));*/

        //12
        /*char[] arr2 = new String("AAAAAAAAAAAA").toCharArray();
        char[] arr = {'a','b','c','e','s','f','c','s','a','d','e','e'};
        char[] arr1 = {'a','b','c','b','s','d','e','c','a','a','d','d'};
        char[] str = {'b','c','c','d'};
        char[] str1 = new String("AAAAAAAAAAAA").toCharArray();
        PathInMatrix pa = new PathInMatrix();
        System.out.println(pa.hasPath(arr2,3,4,str1));*/

        //13
        /*RobotMoveRange rob = new RobotMoveRange();
        System.out.println(rob.movingCount(5,10,10));*/

        //14
        /*CutRope cutRope = new CutRope();
        System.out.println(cutRope.integerBreak(8));*/

        //15
        /*NumberOfOne numb = new NumberOfOne();
        System.out.println(numb.NumberOf1_(-7));*/

        //16
        /*IntegerPower integerPower = new IntegerPower();
        System.out.println(integerPower.Power(2,-3));*/
    }
        //7
        public Stack<TreeNode> addTreeNode(Stack<TreeNode> stack,TreeNode t){
            if (t!=null){
                stack.add(t);
                if(t.left!=null) addTreeNode(stack,t.left);
                if(t.right!=null) addTreeNode(stack,t.right);
            }
            return stack;
        }
}
