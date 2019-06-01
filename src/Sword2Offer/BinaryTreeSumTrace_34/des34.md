**题目**

输入一颗二叉树和一个整数，打印出二叉树中结点值的和为输入整数的所有路径。路径定义为从树的根结点开始往下一直到叶结点所经过的结点形成一条路径。

**解答**

采用回溯法进行路径比比遍历，当路径上节点的数值之和大于`target`则返回上一级搜寻，需要为每个搜寻路径划分空间单独存储：

`ArrayList<Integer> temp = new ArrayList<>(prepath);`