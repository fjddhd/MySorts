# 常用内部排序算法比较与总结
## 选择的原则
- n（需要排序的数组长度，下同）较少时，选用**插入排序**和**选择排序**，但由于插入排序移动次数更多，所以n稍大时用**选择排序**。
- 如果已经基本有序，选择**插入排序**和**冒泡排序**，基本可以接近线性时间复杂度。
- n较大时应采用平均复杂度为O（nlogn）的复杂排序算法，如**快排**，**归并**，**堆排**。
   - **快排**适合关键词分布较随机的待排序列。
   - **堆排**辅助空间少。
   - **归并**主要用于需要排序*稳定*的情况。

## 重要特点
- **插入排序**每轮未必可以确定某一个元素的最终位置，只能确定前若干元素有序。
- **冒泡排序**：每次可以确定一个最大值位置（递增法，下同）。
- **选择排序**：每次可以确定一个最小值位置。
- **快速排序**：每次可以确定划分轴元素的位置。
- **堆排序**：每次确定一个堆顶位置。
