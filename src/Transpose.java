/**
 * 	矩阵原地转置
	空间复杂度O(1)
	
	思路：
	1.逐个遍历元素，将其放在转置矩阵的相应位置上。
	2.关键是找到原有矩阵的元素是什么，因为该元素有可能被替换过。
	3.找原有矩阵元素的方法：
	1）建立原有矩阵和转置矩阵的对应关系
	2）将原有矩阵当前位置，转为转置矩阵的位置，根据转置矩阵的位置，计算出原有矩阵的位置，通过索引号判断是否小于原有矩阵，
	如果小就一直回溯到最终该元素被替换后存在的位置，否则就认为该位置存放元素即为原有矩阵当前元素的值。获得该元素值之后，
	就将其替换到转置矩阵的相应位置。
	举例：
	原有矩阵：
	1 2 3 4
	5 6 7 8
	转置矩阵：
	1 5
	2 6
	3 7
	4 8
 * @author Zhuo KQ
 * @since 2015-8
 */

public class Transpose {

	//找到原始被替换后的最终位置
	static int origin(int i, int m, int n){//m-原有行，n-原有列
		int pos = i;
		int pre = pos;
		while(true){
			pre = pos;
			int row = pos/m, col = pos%m;//现有矩阵的行、列
			pos = col * n + row; //原有矩阵的位置
			
			if(pos >= i) break; //说明没有被更低的索引号占用
		}
		return pre;			
	}
	
	//找到目标替换位置
	static int target(int i, int m, int n){//m-原有行，n-原有列
		int row = i/n, col = i%n;
		int pos = col * m + row;
		return pos;
	}
	
	//转置矩阵
	static void transpose(int[] arr, int m, int n){//m-原有行，n-原有列
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
	
	//测试用例
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
