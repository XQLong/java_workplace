**题目**

输入n个整数，找出其中最小的K个数。例如输入4,5,1,6,2,7,3,8这8个数字，则最小的4个数字是1,2,3,4,。

**解答**

- 快速排序的 `partition()` 方法，会返回一个整数 j 使得` a[l..j-1] `小于等于` a[j]`，且 `a[j+1..h] `大于等于` a[j]`，此时` a[j]` 就是数组的第` j` 大元素。
可以利用这个特性找出数组的第 `K` 个元素，这种找第 `K `个元素的算法称为快速选择算法。

- 维护一个大小为 K 的最小堆，过程如下：在添加一个元素之后，如果大顶堆的大小大于 K，那么需要将大顶堆的堆顶元素去除。