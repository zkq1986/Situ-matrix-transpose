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
�ռ临�Ӷ�O(1)

˼·��
1.�������Ԫ�أ��������ת�þ������Ӧλ���ϡ�
2.�ؼ����ҵ�ԭ�о����Ԫ����ʲô����Ϊ��Ԫ���п��ܱ��滻����
3.��ԭ�о���Ԫ�صķ�����
1������ԭ�о����ת�þ���Ķ�Ӧ��ϵ
2����ԭ�о���ǰλ�ã�תΪת�þ����λ�ã�����ת�þ����λ�ã������ԭ�о����λ�ã�ͨ���������ж��Ƿ�С��ԭ�о������С��һֱ���ݵ����ո�Ԫ�ر��滻����ڵ�λ�ã��������Ϊ��λ�ô��Ԫ�ؼ�Ϊԭ�о���ǰԪ�ص�ֵ����ø�Ԫ��ֵ֮�󣬾ͽ����滻��ת�þ������Ӧλ�á�

������
ԭ�о���
1 2 3 4
5 6 7 8
ת�þ���
1 5
2 6
3 7
4 8

