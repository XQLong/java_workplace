package Sword2Offer;

import Sword2Offer.ArrayOfStackPushAndPop_31.ArrayOfStackPushAndPop;
import Sword2Offer.BinarySearchTreePostTraversal_33.SearchTreePostTraversal;
import Sword2Offer.BinaryTreePrint_32.BinaryTreePrint;
import Sword2Offer.MoreThanHalfNum_39.MoreThanHalfNum;
import Sword2Offer.PrintCharDictionary_38.PrintCharDictionary;
import Sword2Offer.RandomlinkListCopy_35.RandomLinkListCopy;
import Sword2Offer.SerializeTreeNode_37.SerializeTreeNode;
import Sword2Offer.TestInstance.RandomListNode;
import Sword2Offer.TestInstance.TreeNode;

import java.util.ArrayList;
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

        //17
        /*Print1ToN print1ToN = new Print1ToN();
        print1ToN.print1ToN(3);*/

        //18
        /*ListNode head = new ListNode(1);
        ListNode node0 = new ListNode(1);
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(1);
        ListNode node3 = new ListNode(2);
        ListNode node4 = new ListNode(1);
        ListNode node5 = new ListNode(1);
        head.addnode(node0);
        head.addnode(node1);
        head.addnode(node2);
        head.addnode(node3);
        head.addnode(node4);
        head.addnode(node5);
        DeleteNode dn = new DeleteNode();
        ListNode res = dn.deleterepeatnode(head);
        while (res!=null&&res.next!=null){
            res.printnode();
            res = res.next;
        }*/

        //20
        /*String s = "-E-16";
        char[] arr = s.toCharArray();
        StringPresentNumber spn = new StringPresentNumber();
        System.out.println(spn.isNumeric(arr));*/

        //21
        /*int[] arr = {1,2,3,4,5};
        ChangeOddEvenOrder co = new ChangeOddEvenOrder();
        co.reOrderArray1(arr);*/

        //22
        /*ListNode head = new ListNode(1);
        ListNode node0 = new ListNode(1);
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(1);
        ListNode node3 = new ListNode(2);
        ListNode node4 = new ListNode(1);
        ListNode node5 = new ListNode(1);
        head.addnode(node0);
        head.addnode(node1);
        head.addnode(node2);
        head.addnode(node3);
        head.addnode(node4);
        head.addnode(node5);
        InverseKNode inv = new InverseKNode();
        System.out.println(inv.FindKthToTail(head,3).val);*/

        //23
        /*ListNode head = new ListNode(1);
        ListNode node0 = new ListNode(2);
        ListNode node1 = new ListNode(3);
        ListNode node2 = new ListNode(4);
        ListNode node3 = new ListNode(5);
        head.addnode(node0);
        head.addnode(node1);
        head.addnode(node2);
        head.addnode(node3);
        node3.next = node0;
        EntranceOfLoop entranceOfLoop = new EntranceOfLoop();
        entranceOfLoop.EntryNodeOfLoop(head);*/

        //24 & 25
        /*ListNode head = new ListNode(1);
        ListNode node0 = new ListNode(3);
        ListNode node1 = new ListNode(5);
        ListNode node2 = new ListNode(7);
        ListNode node3 = new ListNode(9);
        head.addnode(node0);
        head.addnode(node1);
        head.addnode(node2);
        head.addnode(node3);
        ListNode head_ = new ListNode(2);
        ListNode node0_ = new ListNode(4);
        ListNode node1_ = new ListNode(6);
        ListNode node2_ = new ListNode(8);
        ListNode node3_ = new ListNode(10);
        head_.addnode(node0_);
        head_.addnode(node1_);
        head_.addnode(node2_);
        head_.addnode(node3_);*/
        // ReverseLinkList reverseLinkList = new ReverseLinkList();
        // ListNode listNode = reverseLinkList.ReverseList(head);
        /*MergeLinkList mergeLinkList = new MergeLinkList();
        ListNode listNode = mergeLinkList.Merge1(head,head_);
        while (listNode!=null){
            listNode.printnode();
            listNode = listNode.next;
        }*/

        // 28
       /* TreeNode root = new TreeNode(8);
        TreeNode left = new TreeNode(6);
        TreeNode right = new TreeNode(6);
        TreeNode left1 = new TreeNode(5);
        TreeNode right1 = new TreeNode(5);
        TreeNode left2 = new TreeNode(7);
        TreeNode right2 = new TreeNode(7);
        root.left =  left;
        root.right = right;
        left.left = left1;
        left.right = right1;
        left1.left = left2;
        left1.right = right2;
        TreeSymmetrical treeSymmetrical = new TreeSymmetrical();
        System.out.println(treeSymmetrical.isSymmetrical(root));*/

       // 29
       /* int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        ArrayPrintClosewise apc = new ArrayPrintClosewise();
        apc.printMatrix(arr);*/

       // 31
       /*int[] arr1 = {1,2,3,4,5};
       int[] arr2 = {4,5,3,2,1};
       ArrayOfStackPushAndPop aosp = new ArrayOfStackPushAndPop();
       System.out.println(aosp.IsPopOrder(arr1,arr2));*/

       // 32
        /*TreeNode root = new TreeNode(0);
        TreeNode left = new TreeNode(-1);
        TreeNode right = new TreeNode(1);
        root.left = left;
        root.right = right;
        BinaryTreePrint btp = new BinaryTreePrint();
        // btp.PrintFromTopToBottom(null);
        btp.PrintTreeNodeN(root);*/

        // 33
        /*int[] arr = {5,4,3,2,1};
        SearchTreePostTraversal stpt = new SearchTreePostTraversal();
        stpt.VerifySquenceOfBST(arr);*/

        //35
        /*RandomListNode head = new RandomListNode(0);
        RandomListNode n1 = new RandomListNode(1);
        RandomListNode n2 = new RandomListNode(2);
        RandomListNode n3 = new RandomListNode(3);
        head.next = n1;
        n1.next = n2;
        n2.next = n3;
        head.random = n3;
        n1.random = n3;
        n2.random = head;
        n3.random = n1;
        RandomLinkListCopy rnc = new RandomLinkListCopy();
        rnc.Clone1(head);*/

        //37
        /*TreeNode root = new TreeNode(5);
        TreeNode left = new TreeNode(4);
        TreeNode left1 = new TreeNode(3);
        TreeNode left2 = new TreeNode(2);
        root.left = left;
        left.left = left1;
        left1.left = left2;
        SerializeTreeNode stn = new SerializeTreeNode();
        //String str = stn.Serialize(root);
        //TreeNode t = stn.Deserialize(str);
        // stn.preTraverse1(root);
        // String str = "1-2-4-#-#-5-#-#-3-#-#-";
        stn.Serialize1(root);
        System.out.println(stn.res1);
        stn.Deserialize1(stn.res1);
        System.out.println(stn.ret.val);*/

        //38
        /*PrintCharDictionary pcd  =new PrintCharDictionary();
        // pcd.Permutation("abc");
        ArrayList<String> list = pcd.Permutation1("abb");
        System.out.println(list);*/

        //39
        MoreThanHalfNum mfn = new MoreThanHalfNum();
        mfn.MoreThanHalfNum_Solution1(new int[]{2,2,2,2,2,1,3,4,5});
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
