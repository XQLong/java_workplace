**题目**

数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。例如输入一个长度为9的数组{1,2,3,2,2,2,5,4,2}。由于数字2在数组中出现了5次，超过数组长度的一半，因此输出2。如果不存在则输出0。

**解答**

- 方法1：使用HashMap的性质，统计数组中数字出现的个数

- 方法2：使用`Moore’s Vote`算法：

````
初始化计数值cnt为0
扫描数组
    如果cnt=0,num确定为数组当前扫描值，cnt=1
    如果cnt!=0
        num与数组当前扫描至相等，则cnt++
        num与数组当前扫描不相等，则cnt--
````