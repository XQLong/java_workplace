**题目**

````
    Input:
    "I am a student."
    
    Output:
    "student. a am I"
````

**解答**

- 直接利用`String`对象的`split`方法以`" "`为分隔符，将字符串分割为字符串数组，
然后将字符串数组进行翻转。

- 先将每个单词翻转：``I ma a .tneduts``，再将整个字符串翻转``students. a am I``。

**题目**

将字符序列循环左移k位，如字符序列`S="abcXYZdef"`，循环左移3位后为`S="XYZdefabc"`。

**解答**

先将左边要循环左移的k位进行翻转，`S="cbaXYZdef"`；再将剩下的部分进行翻转`S="cbafedZYX"`；
最后将整个字符串进行翻转`S="XYZdefabc"`。