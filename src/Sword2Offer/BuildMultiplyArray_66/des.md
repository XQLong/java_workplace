**题目**

给定一个数组`A[0,1,...,n-1]`,请构建一个数组`B[0,1,...,n-1]`,
其中B中的元素`B[i]=A[0]*A[1]*...*A[i-1]*A[i+1]*...*A[n-1]`。不能使用除法。

**解答**

依次从左和从右遍历数组两次，分别计算当前位置左边所有数之积和右边所有数之积，最后
求取该位置左右两边之积，以数组`{1,2,3,4,5}`为例：

````
    遍历第一次先计算当前位置左边之积（左边没有置为1）：
    {1，1，2，6，24}
    遍历第二次计算当前位置右边之积（右边没有置为1）：
    {120，60，20，5，1}
    求取该位置左右两边的积（积计算所得数组对应位置相乘）：
    {120，60，40，30，24}
````
