package com.pb.a;

public class Test {
	public static void main(String[] args) {
		int[][] a = new int[9][9];
		// 计算九九表，并将结果保存在二维数组的每个元素中。
		// for (int i = 0; i < a.length; i++) {
		// for (int j = 0; j < a[i].length; j++) {
		// a[i][j] = (i + 1) * (j + 1);
		// }
		// }
		// 打印九九表(2)
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print((i + 1) + "*" + (j + 1) + "=" + (i + 1)
						* (j + 1) + "\t");
			}
			System.out.println();
		}
	}
}
