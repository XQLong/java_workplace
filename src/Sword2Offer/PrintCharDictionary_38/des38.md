**题目**

输入一个字符串,按字典序打印出该字符串中字符的所有排列。例如输入字符串abc,则打印出由字符a,b,c所能排列出来的所有字符串abc,acb,bac,bca,cab和cba。

**解答**

- 方法1：
直接不考虑重复的情况递归进行全排列求出所有情况，使用HashSet的性质来去除重复。

- 方法2：
直接在递归的时候去除掉重复的情况。在没有重复的情况下：
<div align="center">
    <img src="https://github.com/XQLong/java_workplace/blob/master/img/StringSort.png"></img>
</div>
在有重复时使用`list`来保存同一层递归中前面已经出现的字符：
<div align="center">
    <img src="https://github.com/XQLong/java_workplace/blob/master/img/StringSort1.png"></img>
</div>