**题目**

输入一个字符串（只包含 a~z 的字符），求其最长不含重复字符的子字符串的长度。
例如对于 arabcacfr，最长不含重复字符的子字符串为 acfr，长度为 4。

**解答**

本题有两种思路:

- 使用两层`for`循环嵌套，按照如下图进行推导求解：
    
    <div align="center">
        <img src="https://github.com/XQLong/java_workplace/blob/master/img/LongestSubString1.png"></img>
    </div>


- 空间换时间，使用数组记录字符最后出现的位置,一层for循环，按如下图方式求解：
    
    <div align="center">
        <img src="https://github.com/XQLong/java_workplace/blob/master/img/LongestSubString2.png"></img>
    </div>
    
通过比较两种求解方式可以发现，两种解法的不同之处在于计算`flag`时方法一使用了内层循环；
而方法二使用数组保存了前面已出现字符的位置信息，利用它来进行计算，从而降低算法的时间复杂度。