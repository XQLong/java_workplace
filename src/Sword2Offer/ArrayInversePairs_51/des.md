**题目**

在数组中的两个数字，如果前面一个数字大于后面的数字，则这两个数字组成一个逆序对。输入一个数组,求出这个数组中的逆序对的总数P。
并将P对`1000000007`取模的结果输出，即输出`P%1000000007`。

**解答**

使用归并排序算法对数组进行排序在排序过程中计算逆序对个数。