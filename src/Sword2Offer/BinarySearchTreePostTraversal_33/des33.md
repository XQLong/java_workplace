**题目**

输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历的结果。
如果是则输出Yes,否则输出No。假设输入的数组的任意两个数字都互不相同。

**解答**

首先得先弄清楚二叉搜索树的概念：

二叉搜索树也称二叉查找树、有序二叉树或排序二叉树，是指一颗空树或者具有下列性质的二叉树：

- 若任意节点的左子树不为空，则左子树上所有的节点的值均小于它的根节点的值；
- 若任意节点的右子树不为空，则右子树上所有的节点的值均大于它的根节点的值；
- 任意节点的左、右子树也分别是二叉查找树；
- 没有键值相等的节点。

![BinarySearchTree](https://github.com/XQLong/java_workplace/blob/master/img/BinarySearchTree.png)

算法思想：首先根据后续遍历的特点找到二叉树的根节点及其左右子树上的节点，验证左右子树是的所有节点都满足与二叉搜索树根节点的大小关系。
对数组进行递归验证所有子树，当所有子树都满足时，则该数组为某二叉搜索树的后续遍历序列。
