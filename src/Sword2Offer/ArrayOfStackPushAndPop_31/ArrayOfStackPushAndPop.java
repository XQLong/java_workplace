package Sword2Offer.ArrayOfStackPushAndPop_31;

import java.util.Stack;

/**
 * Created by xql on 2019/4/25.
 */
public class ArrayOfStackPushAndPop {
    public boolean IsPopOrder(int [] pushA,int [] popA) {
        Stack<Integer> stack = new Stack<Integer>();
        int ind = 0;
        for (int i=0;i<pushA.length;i++){
            stack.push(pushA[i]);
            while (stack!=null&&stack.peek()==popA[ind]) {
                stack.pop();
                ind++;
                if(ind==popA.length) return true;
            }
        }
        return false;
    }
}
