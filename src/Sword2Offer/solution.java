package Sword2Offer;

import Sword2Offer.TestInstance.TreeNode;
import Sword2Offer.minNumberInRotateArray_11.MinNumberInRotateArray1;
import Sword2Offer.rebuild_binary_tree_7.RebuildBinaryTree;

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
        int[] arr4 = {6,6,6,6,6,7,1};
        MinNumberInRotateArray1 m = new MinNumberInRotateArray1();
        System.out.println(m.minNumberInRotateArray(arr));
        System.out.println(m.minNumberInRotateArray(arr1));
        System.out.println(m.minNumberInRotateArray(arr2));
        System.out.println(m.minNumberInRotateArray(arr3));
        System.out.println(m.minNumberInRotateArray(arr4));*/

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
        /*MoreThanHalfNum mfn = new MoreThanHalfNum();
        mfn.MoreThanHalfNum_Solution1(new int[]{2,2,2,2,2,1,3,4,5});*/

        //40
        /*LeastNumbers leastNumbers = new LeastNumbers();
        int[] input = {2,345,67,8};
        ArrayList res = leastNumbers.GetLeastNumbers_Solution(input,5);*/

        //43
        /*TimesOf1Between1AndN tmb = new TimesOf1Between1AndN();
        int res = tmb.NumberOf1Between1AndN_Solution(100);*/

        //44
        /*Solution solution = new Solution();
        DightAtStringIndex atStringIndex = new DightAtStringIndex();
        int[] TestArr = {11,44,2345,5676878,345,6788,345346,1145,67,875456,5646878,89845,4788,3455246};
        for (int i:TestArr){
            int res1 = solution.getDigitAtIndex(i);     //github解答思路
            int res2 = atStringIndex.getDigitAtIndex(i);
            System.out.println("res1:"+res1+"  res2:"+res2);
            if(res1==res2) System.out.println("right");
            else System.out.println("error");
        }*/

        //45
        /*ArrayToMiniNumber arrayToMiniNumber = new ArrayToMiniNumber();
        int[] input = new int[]{3334,3,3333332};
        arrayToMiniNumber.PrintMinNumber(input);*/

        //46
        /*TransNumberToString tnt = new TransNumberToString();
        int res = tnt.numDecodings("12258");*/

        //47
        /*PresentMaxValue pmv = new PresentMaxValue();
        //int[][] input = {{}};
        int[][] input = {{1,10,3,8,5,6},{12,2,9,6,7,5},{5,7,4,11,4,6},{3,7,16,5,3,7},{5,7,4,11,1,5},{3,7,16,5,1,5}};
        pmv.getMost(input);*/

        //48
        /*LongestSubString lsb = new LongestSubString();
        String[] strs = {"arabcacfr","dfhs","dsgfuerhfsfgs","sfdjhoisd","aaaaa","adadadsd","adcdcdc","dcvdvcsjea"};
        for (String s:strs){
            int res1 = lsb.getLongestSubString(s);
            int res2 = lsb.longestSubStringWithoutDuplication(s);
            System.out.print("res1:"+res1+"   res2:"+res2);
            if(res1==res2) System.out.println("   right");
            else System.out.println("   wrong");
        }*/

        //49
        /*UglyNumber uglyNumber = new UglyNumber();
        for (int i=0;i<30;i++){
            int n = uglyNumber.GetUglyNumber_Solution(i);
            System.out.println(n);
        }*/

        //51
        /*ArrayInversePairs aip = new ArrayInversePairs();
        int[] intput = {1,2,4,3,6,8,1,3,5,7,2,4};
        aip.InversePairs(intput);*/

        //52
        /*ListNode pHead1 = new ListNode(1);
        ListNode p1_2 = new ListNode(2);
        ListNode p1_3 = new ListNode(3);
        ListNode p1_2_4 = new ListNode(4);
        ListNode p1_2_5 = new ListNode(5);
        ListNode p1_2_6 = new ListNode(6);
        pHead1.next = p1_2; p1_2.next = p1_3;   p1_3.next = p1_2_4; p1_2_4.next = p1_2_5; p1_2_5.next = p1_2_6;
        ListNode pHead2 = new ListNode(2);
        ListNode p2_3 = new ListNode(3);
        pHead2.next = p2_3; p2_3.next = p1_2_4;
        FirstCommonListNode fcn = new FirstCommonListNode();
        fcn.FindFirstCommonNode(pHead1,pHead2);*/

        //53
        /*int[] input = {3,3,3,3};
        TimesOfNumberInArray tna = new TimesOfNumberInArray();
        int res = tna.GetNumberOfK1(input,3);*/

        //54
        /*TreeNode root = new TreeNode(8);
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
        DeepOfBinaryTree dbt = new DeepOfBinaryTree();
        int res = dbt.TreeDepth(root);*/

        //56
        /*OnceNumberInArray ona = new OnceNumberInArray();
        int res = ona.getOnePoint(3);*/

        //57
        /*ContinuousNumberSum cns = new ContinuousNumberSum();
        cns.FindContinuousSequence(3);*/

        //58
        /*ReverseWords rw = new ReverseWords();
        String res = rw.ReverseSentence1("I am a student");*/

        //59
        /*MaxInArrayWindow miw = new MaxInArrayWindow();
        int[] input = {2,3,4,2,6,2,5,1};
        miw.maxInWindows(input,3);*/

        //60
        /*SumOfNDice sond = new SumOfNDice();
        sond.dicesSum(15);*/

        //61
        /*PokerOrder po = new PokerOrder();
        int[] input = {0,3,1,6,4};
        boolean b = po.isContinuous(input);*/

        //62
        /*LastRemainInCircle lric = new LastRemainInCircle();
        int res = lric.LastRemaining_Solution(18,6);*/

        //66
        /*int[] input = {1,2,3,4,5};
        BuildMultiplyArray bma = new BuildMultiplyArray();
        int[] res = bma.multiply(input);*/
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
