Situ matrix transpose
===========================================================

Situ matrix transpose

Space complexity O(1)

Ideas:
1. Traversing elements one by one, put it in the transposed matrix corresponding position.
2. The key point is to find what the original matrix element, because the element is likely to be replaced.
3. Get original matrix element method:
	1) To establish the correspondence between the original matrix and the transposed matrix.
	2) The current position of the original matrix, transpose matrix into the position according to the position of the transposed matrix, calculates the position of the original matrix, the index number is determined by the matrix is smaller than the original, if it has a small back to the final element to be replaced after a position exists, otherwise the value of the storage location of the original matrix element is the current element is considered. After obtaining the value of the element, it will replace the transposed matrix corresponding position.


Examples:

Original matrix:
1234
5678

Transposed matrix:
15
26
37
48



=======================================================
空间复杂度O(1)

思路：
1.逐个遍历元素，将其放在转置矩阵的相应位置上。
2.关键是找到原有矩阵的元素是什么，因为该元素有可能被替换过。
3.找原有矩阵元素的方法：
1）建立原有矩阵和转置矩阵的对应关系
2）将原有矩阵当前位置，转为转置矩阵的位置，根据转置矩阵的位置，计算出原有矩阵的位置，通过索引号判断是否小于原有矩阵，如果小就一直回溯到最终该元素被替换后存在的位置，否则就认为该位置存放元素即为原有矩阵当前元素的值。获得该元素值之后，就将其替换到转置矩阵的相应位置。

举例：
原有矩阵：
1 2 3 4
5 6 7 8
转置矩阵：
1 5
2 6
3 7
4 8

