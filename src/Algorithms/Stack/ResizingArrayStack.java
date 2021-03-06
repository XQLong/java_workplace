package Algorithms.Stack;

import java.util.Iterator;

/**
 * Created by xql on 2018/11/30.
 */

//使用动态调整数组大小的实现栈
public class ResizingArrayStack<Item> implements Iterable<Item> {
    private Item[] a = (Item[]) new Object[1]; //栈元素
    private int N = 0;
    public boolean isEmpty(){   return N==0;}
    public int size(){  return N;}
    //将栈移动到一个大小为max的新数组
    public void resize(int max){
        Item[] temp = (Item[]) new Object[max];
        for(int i = 0;i<N;i++){
            temp[i] = a[i];
        }
        a = temp;
    }
    public void push(Item item){
        //将元素添加到栈顶
        if(N==a.length) resize(2*a.length);
        a[N++] = item;
    }
    public Item pop(){
        //从栈顶删除元素
        Item item = a[--N];
        a[N] = null;    //避免对象游离
        if(N>0 && N==a.length/4) resize(a.length/2);
        return item;
    }
    @Override
    public Iterator<Item> iterator() {
        return new ReverseArrayIterator();
    }
    private class ReverseArrayIterator implements Iterator<Item>{
        //支持后进先出的迭代
        private int i = N;
        public boolean hasNext(){
            return i>0;
        }
        public Item next(){
            return a[i--];
        }
        public void remove(){

        }
    }
}
