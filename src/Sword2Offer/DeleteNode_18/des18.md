**题目**

删除链表中重复的节点。

**解答**

分为头结点和下一节点是否相等两种情况，若相等以下一节点为头结点进行递归；若不相等，则将头节点
指向`deleteDuplication(next)`，即其子问题返回的头结点。