package com.pb.a;

public class JiuJiuTest {

	/*
	 * 1*1*=1 1*2=2 2*2=4 1*3=3 2*3=6 3*3=9 1*4=4 2*4=8 3*4=12 4*4=16
	 */

	public static int[][] arrays = new int[9][9];
	/*
	 * 多维数组 三维数组
	 */
	public static int[][][] cc;
	public static int[][][] dd = new int[][][] {

	{ { 101, 102, 103 }, { 104, 105, 106 }
	//dd[0][0][0] dd[0][0][1]  05  dd[0][1][1]

	}, { { 11, 12, 13 }, { 14, 15, 16 }

	}

	};

	public static void main(String[] args) {

		System.out.println(dd.length);
		System.out.println(dd[0][0][0]);

	}

	public static void hao() {

		// 循环打印输出
		for (int i = 0; i < arrays.length; i++) {
			for (int j = 0; j <= i; j++) {
				// 输出
				System.out.print((j + 1) + "*" + (i + 1) + "=" + (j + 1)
						* (i + 1) + "\t");
			}
			System.out.println();
		}
	}

}
