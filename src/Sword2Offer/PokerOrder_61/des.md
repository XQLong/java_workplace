**题目**

若一副扑克牌中有四张鬼牌，其中大小鬼为癞子，牌面为 0。随意抽出几张判断这张牌是否能组成顺子。

**解答**

使用一个整数`num0`来统计赖子的个数，将数组进行排序（可使用`Array.sort`方法或使用`PriorityQueue`），使用
赖子去补全数组中不连续的地方。