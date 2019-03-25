**题目**

用两个栈来实现一个队列，完成队列的Push和Pop操作。 队列中的元素为int类型。

**要求**

时间限制：1秒 空间限制：32768K

----
**解答**

用stark1存储push()的值，当进行pop()操作时将stark1中的值先入栈stark2（**若stark2为空**），再对stark2进行pop()操作。要特别注意只有stark2为空时，才进行上述操作，否则直接对stark2进行pop()。

````
    push(5);
    push(2);
    pop();
    push(0);
    pop();
    pop();
````
![image](https://github.com/XQLong/java_workplace/blob/master/img/stark_queue.png)