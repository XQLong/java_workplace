**题目**

让小朋友们围成一个大圈。然后，随机指定一个数`m`，让编号为`0`的小朋友开始报数。
每次喊到`m-1`的那个小朋友要出列唱首歌，然后可以在礼品箱中任意的挑选礼物，并且不再回到圈中，
从他的下一个小朋友开始，继续`0...m-1`报数 .... 这样下去 .... 直到剩下最后一个小朋友，可以不用表演。

**解答**

本题主要利用了约瑟夫环的结论：

````
若记第n次出圈的位置为`Pn`可以由第n-1次的位置`Pn-1`和`m`值来确定:
Pn = (Pn-1+m)%n
````

详细关于约瑟夫环的结论验证和推导相关过程此处省略。可参考：

[约瑟夫环简要推导](URL 'https://www.jianshu.com/p/6ee5c7b21333')

[约瑟夫环简要验证](URL 'https://www.cnblogs.com/qingergege/p/7598822.html')

若不采用约瑟夫环的结论也可以使用暴力计算（时间空间复杂度都较大，仅供自娱自乐），使用一个
数组模拟约瑟夫环，用值`-1`代表该位置出圈，使用函数`CircelNext`求取当前位置的
下一个位置。