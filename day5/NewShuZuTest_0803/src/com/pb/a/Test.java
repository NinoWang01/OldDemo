package com.pb.a;

public class Test {
	public static void main(String[] args) {
		int[][] a = new int[9][9];
		// ����žű�������������ڶ�ά�����ÿ��Ԫ���С�
		// for (int i = 0; i < a.length; i++) {
		// for (int j = 0; j < a[i].length; j++) {
		// a[i][j] = (i + 1) * (j + 1);
		// }
		// }
		// ��ӡ�žű�(2)
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print((i + 1) + "*" + (j + 1) + "=" + (i + 1)
						* (j + 1) + "\t");
			}
			System.out.println();
		}
	}
}
