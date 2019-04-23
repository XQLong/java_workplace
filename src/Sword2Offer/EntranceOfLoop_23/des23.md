**题目**

一个链表中包含环，请找出该链表的环的入口结点。

**要求**

要求不能使用额外的空间。

**解答**
- step1:使用双指针，一个fast指针每次移动两个节点，一个slow每次移动一个节点。
当它们第一次相遇时满足：

````
slow经过的节点数：x
fast：2x
环所包含的节点数：n = 2x -x = x
slow经过的节点数：x = 环外节点数 + slow环内已经过节点数 = n
````
由上式可知slow再移动环外节点数个节点就能遍历一边环内所有节点，到达入口节点。

![entrynodeofloop](https://github.com/XQLong/java_workplace/blob/master/img/entrynodeofloop.png)

- step2:保留slow指针在上一步中的位置，使用另一指针由链表起始点开始同时与
slow指针以每次一个节点的速度移动，则它们将相遇在链表中环的起始点。