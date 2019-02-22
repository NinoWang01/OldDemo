package com.pb.c;

public class Test3 {
	public static int[] arr1 = new int[5];
	public static double[] arr2 = new double[5];
	public static long[] arr3 = new long[5];
	public static char[] arr4 = new char[5];// 空格，\u0000
	public static short[] arr5 = new short[5];
	public static byte[] arr6 = new byte[5];
	public static float[] arr7 = new float[5];
	public static boolean[] arr8 = new boolean[5];
	// 引用数据类型，例如String
	public static String[] str = new String[5];

	public static void main(String[] args) {

		// 这些数组的初始化元素，是由JVM给定的
		System.out.println(arr1[0]);
		System.out.println(arr2[0]);
		System.out.println(arr3[0]);
		System.out.println(arr4[0]);
		System.out.println(arr5[0]);
		System.out.println(arr6[0]);
		System.out.println(arr7[0]);
		System.out.println(arr8[0]);
		System.out.println(str[0]);
	}
}
