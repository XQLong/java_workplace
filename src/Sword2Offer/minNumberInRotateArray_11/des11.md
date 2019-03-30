**题目**

把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。 输入一个非减排序的数组的一个旋转，输出旋转数组的最小元素。 例如数组{3,4,5,1,2}为{1,2,3,4,5}的一个旋转，该数组的最小值为1。 NOTE：给出的所有元素都大于0，若数组大小为0，请返回0。

**要求**

时间限制：3秒 空间限制：32768K

----
**解答**

利用数组的旋转的性质采用二分查找，利用indhead,indend以及两者中间的indc所对应位置值的大小进行区域缩小，

![rotate_arr](https://github.com/XQLong/java_workplace/blob/master/img/rotate_arr.png)

在对搜索范围进行缩小的过程中，若果三者的值都相等，则无法确定下个搜索区间，如下图这两种情况，

![rotate_arr_order](https://github.com/XQLong/java_workplace/blob/master/img/rotate_arr_order.png)

此种情况下便需要回到顺序查找进行搜索。