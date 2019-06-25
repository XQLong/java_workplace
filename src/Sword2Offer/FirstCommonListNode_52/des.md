**题目**

输入两个链表，找出它们的第一个公共结点。

**解答**

<div align="center">
    <img src="https://github.com/XQLong/java_workplace/blob/master/img/FirstCommonListNode.png"></img>
</div>

设 A 的长度为` a + c`，B 的长度为` b + c`，其中 c 为尾部公共部分长度，可知` a + c + b = b + c + a`。
当访问链表 A 的指针访问到链表尾部时，令它从链表 B 的头部重新开始访问链表 B；
同样地，当访问链表 B 的指针访问到链表尾部时，令它从链表 A 的头部重新开始访问链表 A。这样就能控制访问 A 和 B 两个链表的指针能同时访问到交点。
需注意的时`a、b、c`三个部分中有节点为空时的情况。

