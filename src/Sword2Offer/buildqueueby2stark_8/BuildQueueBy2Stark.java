package Sword2Offer.buildqueueby2stark_8;

import java.util.Stack;

/**
 * Created by xql on 2019/3/25.
 */
public class BuildQueueBy2Stark {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        stack1.push(node);
    }

    public int pop() {
        if(stack2.isEmpty()){
            while(!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }
}
