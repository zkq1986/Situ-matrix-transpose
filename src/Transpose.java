/**
 * 	����ԭ��ת��
	�ռ临�Ӷ�O(1)
	
	˼·��
	1.�������Ԫ�أ��������ת�þ������Ӧλ���ϡ�
	2.�ؼ����ҵ�ԭ�о����Ԫ����ʲô����Ϊ��Ԫ���п��ܱ��滻����
	3.��ԭ�о���Ԫ�صķ�����
	1������ԭ�о����ת�þ���Ķ�Ӧ��ϵ
	2����ԭ�о���ǰλ�ã�תΪת�þ����λ�ã�����ת�þ����λ�ã������ԭ�о����λ�ã�ͨ���������ж��Ƿ�С��ԭ�о���
	���С��һֱ���ݵ����ո�Ԫ�ر��滻����ڵ�λ�ã��������Ϊ��λ�ô��Ԫ�ؼ�Ϊԭ�о���ǰԪ�ص�ֵ����ø�Ԫ��ֵ֮��
	�ͽ����滻��ת�þ������Ӧλ�á�
	������
	ԭ�о���
	1 2 3 4
	5 6 7 8
	ת�þ���
	1 5
	2 6
	3 7
	4 8
 * @author Zhuo KQ
 * @since 2015-8
 */

public class Transpose {

	//�ҵ�ԭʼ���滻�������λ��
	static int origin(int i, int m, int n){//m-ԭ���У�n-ԭ����
		int pos = i;
		int pre = pos;
		while(true){
			pre = pos;
			int row = pos/m, col = pos%m;//���о�����С���
			pos = col * n + row; //ԭ�о����λ��
			
			if(pos >= i) break; //˵��û�б����͵�������ռ��
		}
		return pre;			
	}
	
	//�ҵ�Ŀ���滻λ��
	static int target(int i, int m, int n){//m-ԭ���У�n-ԭ����
		int row = i/n, col = i%n;
		int pos = col * m + row;
		return pos;
	}
	
	//ת�þ���
	static void transpose(int[] arr, int m, int n){//m-ԭ���У�n-ԭ����
		for(int i = 1; i < m*n - 1; i++){
			int ori = origin(i,m,n);
			int tar = target(i,m,n);
			swap(arr, ori, tar);
		}
	}
	
	static void swap(int[] arr, int i, int j){
		int t= arr[i];
		arr[i] = arr[j];
		arr[j] = t;
	}
	
	static void print(int[] arr, int m, int n){		
		for(int i = 0; i < m;i++){
			for(int j = 0; j < n; j++){
				System.out.print(arr[i*n + j] + "\t");
			}
			System.out.println();
		}
		System.out.println("================================");
	}
	
	//��������
	public static void main(String[] args) {
		int[] arr = {0,1,2,3,
					 4,5,6,7,
					 8,9,10,11};
		int m = 3, n =4;
		print(arr, m, n);
		transpose(arr, m, n);
		print(arr, n, m);
	}
}
