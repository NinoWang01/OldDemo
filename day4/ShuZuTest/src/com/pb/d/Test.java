package com.pb.d;

public class Test {
	public static int[][] str = { { 10, 2, 3, 25 }, { 11, 2, 23, 90 } };

	/*
	 * һά���飺str[0] ָ��{ 10, 2, 3, 25 }, һλ���飺str[1] ָ��{ 11, 2, 23, 90 }
	 */

	public static void main(String[] args) {
		PaiXu();
	}

	public static void PaiXu() {
		// { { 10, 2, 3, 25 }, { 11, 2, 23, 90 } }
		// ��֤��ά���������Ԫ�ض�������
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
			// ����
			System.out.println();
		}

	}

}
