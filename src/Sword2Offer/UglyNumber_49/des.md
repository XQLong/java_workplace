**题目**

把只包含因子 2、3 和 5 的数称作丑数（Ugly Number）。例如 6、8 都是丑数，但 14 不是，因为它包含因子 7。
习惯上我们把 1 当做是第一个丑数。求按从小到大的顺序的第 N 个丑数。

**解答**

解题思路为如果已知了n个丑数，第n+1个丑数必然是前面的某个丑数乘以2，或者乘以3，或者乘以5。
至于是谁，就是都尝试一下，取最小。如下图:

<div align="center">
    <img src="https://github.com/XQLong/java_workplace/blob/master/img/UglyNumber.png"></img>
</div> 

