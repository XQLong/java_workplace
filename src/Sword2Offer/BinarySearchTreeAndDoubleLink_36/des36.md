**题目**

输入一棵二叉搜索树，将该二叉搜索树转换成一个排序的双向链表。要求不能创建任何新的结点，只能调整树中结点指针的指向。

**解答**

使用递归来对搜索二叉树进行中序遍历，然后将各个节点按照双向链表进行连接：

<div align="center">
    <img src="https://github.com/XQLong/java_workplace/blob/master/img/BSTDoubleLink.png"></img>
</div>