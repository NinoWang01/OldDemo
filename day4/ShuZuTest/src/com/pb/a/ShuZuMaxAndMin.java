package com.pb.a;

public class ShuZuMaxAndMin {

	public static int[] a = { 10, 5, 200, 8, 3, 90 };
	// 0 1 2 3 4 5
	public static int b;
	public static int i;
	public static int j;

	public static void main(String[] args) {

		for (j = 0; j < a.length ; j++) {

			for (i = 0; i < a.length -j- 1; i++) {
				/*
				 * a[i] > a[i + 1] >求的最大值 
				 * a[i] < a[i + 1] <求的最小值
				 */
				if (a[i] < a[i + 1]) {

					b = a[i];
					a[i] = a[i + 1];
					a[i + 1] = b;
				}
			}
			System.out.println(a[i]);
		}

	}
}
