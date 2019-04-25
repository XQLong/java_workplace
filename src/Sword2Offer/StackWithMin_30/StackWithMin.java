package Sword2Offer.StackWithMin_30;

import java.util.Stack;

/**
 * Created by xql on 2019/4/25.
 */
public class StackWithMin {
    private Stack<Integer> dataStack = new Stack<>();
    private Stack<Integer> MiniStack = new Stack<>();
    public void push(int node) {
        dataStack.push(node);
        MiniStack.push(MiniStack.isEmpty()?node:Math.min(MiniStack.peek(),node));
    }

    public void pop() {
        dataStack.pop();
        MiniStack.pop();
    }

    public int top() {
        return dataStack.peek();
    }

    public int min() {
        return MiniStack.peek();
    }
}
