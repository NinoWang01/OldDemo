package com.pb.d;

public class Test {
	public static int[][] str = { { 10, 2, 3, 25 }, { 11, 2, 23, 90 } };

	/*
	 * 一维数组：str[0] 指向{ 10, 2, 3, 25 }, 一位数组：str[1] 指向{ 11, 2, 23, 90 }
	 */

	public static void main(String[] args) {
		PaiXu();
	}

	public static void PaiXu() {
		// { { 10, 2, 3, 25 }, { 11, 2, 23, 90 } }
		// 保证二维数组的所有元素都被排序
		for (int a = 0; a < str.length; a++) {
			for (int i = 0; i < str[a].length; i++) {

				for (int j = 0; j < str[a].length - i - 1; j++) {
					int max;
					if (str[a][j] > str[a][j + 1]) {
						max = str[a][j];
						str[a][j] = str[a][j + 1];
						str[a][j + 1] = max;
					}
				}
			}
			for (int k = 0; k < str[a].length; k++) {
				System.out.print(str[a][k] + "\t");
			}
			// 换行
			System.out.println();
		}

	}

}
