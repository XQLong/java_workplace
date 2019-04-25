**题目**

输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字，例如，如果输入如下4 X 4矩阵： 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 则依次打印出数字1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10.

**要求**

时间限制：1秒 空间限制：32768K

**解答**

将数组每顺时针遍历一圈后重新限制遍历边界，直至遍历完整个数组。

![ArrayClosewisePrint](https://github.com/XQLong/java_workplace/blob/master/img/ArrayClosewisePrint.png)