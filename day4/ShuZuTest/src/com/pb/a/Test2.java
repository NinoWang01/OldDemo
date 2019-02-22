package com.pb.a;

public class Test2 {

	/*
	 * 二维数组的声明和定义 和一维数组的比较 一维数组：int[] a; 二维数组：int[][] a;
	 */
	public int[][] a;
	// 第二种二维数组的声明和定义
	public int b[][];
	// 第三种方式,给数组一个长度，
	public int c[][] = new int[5][];

	// d[0]:指的是：{ 1, 2, 3 }
	// d[0][0]:指的是{ 1, 2, 3 }中的元素：1
	/*
	 * int [] d[0]=new int[3];
	 * 
	 * 二维数组里的元素：d[0][]、d[1][]、d[2][]、d[3][]
	 * 
	 * d[0][]里的元素：d[0][0]、d[0][1]、d[0][2]
	 */

	// 静态赋值
	public static int h[][] = { { 100, 20, 30 }, { 40, 5, 60 } };
	// 动态初始化数组的元素值
	public static int d[][] = new int[][] { { 100, 200, 1, 2, 3 },
			{ 40, 5, 16 }, { 70, 8, 9 }, { 40, 5, 101, 13, 1 } };
	// 0 1 2
	// 13 101 1
	public static int bb;
	public static int m;
	public static int n;

	public static void main(String[] args) {

		// 保证二维数组的每个元素，都被循环到,m=0//m=1//m=2//m=3
		for (m = 0; m < d.length; m++) {

			// 嵌套循环做排序
			for (n = 0; n < d[m].length - 1; n++) {
				// 排序
				for (int j = 0; j < d[m].length - n - 1; j++) {
					if (d[m][j] > d[m][j + 1]) {
						bb = d[m][j];
						d[m][j] = d[m][j + 1];
						d[m][j + 1] = bb;
					}
				}
			}

			// 遍历数组
			for (int k = 0; k < d[m].length; k++) {
				System.out.print(d[m][k] + "\t");
			}
			System.out.println();
		}
		HaoHao hao = new HaoHao();
		hao.eat();
		hao.run();
		hao.sleep();
		hao.shit();

	}

}
