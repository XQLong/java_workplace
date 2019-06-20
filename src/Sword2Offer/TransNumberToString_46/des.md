**题目**

给定一个数字，按照如下规则翻译成字符串：`1 `翻译成`“a”，2 `翻译成`“b”... 26 `翻译成`“z”`。
一个数字有多种翻译可能，例如 `12258` 一共有 `5` 种，分别是 `abbeh，lbeh，aveh，abyh，lyh`。
实现一个函数，用来计算一个数字有多少种不同的翻译方法。

**解答**

本题解答有两种思路：

- 从左至右（从顶至底）依次递推，最后得到所有的解码方式：

    <div align="center">
        <img src="https://github.com/XQLong/java_workplace/blob/master/img/DecodeNumbers1.png"></img>
    </div> 
   
  从图中以`12258`为例进行解码，可以看到此种算法进行了大量的局部的重复计算，如`“258”`部分进行了两次计算，
  “58”部分计算了三次。
  
- 从右至左（从底至上）使用动态规划：

    <div align="center">
         <img src="https://github.com/XQLong/java_workplace/blob/master/img/DecodeNumbers2.png"></img>
    </div> 
    
  由上图推导得出相应的公式，进行计算。此处需注意的是当数字中出现`“0”`的情况考虑。
    
     
