**题目1**

如何得到一个数据流中的中位数？如果从数据流中读出奇数个数值，那么中位数就是所有数值排序之后位于中间的数值。
如果从数据流中读出偶数个数值，那么中位数就是所有数值排序之后中间两个数的平均值。我们使用Insert()方法读取数据流，使用GetMedian()方法获取当前读取数据的中位数。

**解答**

使用一个大顶堆和一个小顶堆分别保存输入数据的左半部分和右半部分，并统计数据输入的个数，
根据数据个数的奇偶来确定加入哪边。需注意求中位数时，N为偶数时数据加到了右边，此时N变成
基数，所以N为基数时的中位数应为右边小顶堆的堆顶。

**题目2**

请实现一个函数用来找出字符流中第一个只出现一次的字符。例如，当从字符流中只读出前两个字符 "go" 时，第一个只出现一次的字符是 "g"。
当从该字符流中读出前六个字符“google" 时，第一个只出现一次的字符是 "l"。如果当前字符流没有存在出现一次的字符，返回#字符。

**解答**

  - 使用一个长度为256的数组来对字符出现的次数进行统计，
  - 使用队列来保存数据。
  
  当队列顶端的元素不是第一次出现时进行`poll`操作，保证队列顶端的元素为第一次出现，若队列为空返回`#`。