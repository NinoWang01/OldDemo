package com.pb.a;

public class Test2 {

	/*
	 * ��ά����������Ͷ��� ��һά����ıȽ� һά���飺int[] a; ��ά���飺int[][] a;
	 */
	public int[][] a;
	// �ڶ��ֶ�ά����������Ͷ���
	public int b[][];
	// �����ַ�ʽ,������һ�����ȣ�
	public int c[][] = new int[5][];

	// d[0]:ָ���ǣ�{ 1, 2, 3 }
	// d[0][0]:ָ����{ 1, 2, 3 }�е�Ԫ�أ�1
	/*
	 * int [] d[0]=new int[3];
	 * 
	 * ��ά�������Ԫ�أ�d[0][]��d[1][]��d[2][]��d[3][]
	 * 
	 * d[0][]���Ԫ�أ�d[0][0]��d[0][1]��d[0][2]
	 */

	// ��̬��ֵ
	public static int h[][] = { { 100, 20, 30 }, { 40, 5, 60 } };
	// ��̬��ʼ�������Ԫ��ֵ
	public static int d[][] = new int[][] { { 100, 200, 1, 2, 3 },
			{ 40, 5, 16 }, { 70, 8, 9 }, { 40, 5, 101, 13, 1 } };
	// 0 1 2
	// 13 101 1
	public static int bb;
	public static int m;
	public static int n;

	public static void main(String[] args) {

		// ��֤��ά�����ÿ��Ԫ�أ�����ѭ����,m=0//m=1//m=2//m=3
		for (m = 0; m < d.length; m++) {

			// Ƕ��ѭ��������
			for (n = 0; n < d[m].length - 1; n++) {
				// ����
				for (int j = 0; j < d[m].length - n - 1; j++) {
					if (d[m][j] > d[m][j + 1]) {
						bb = d[m][j];
						d[m][j] = d[m][j + 1];
						d[m][j + 1] = bb;
					}
				}
			}

			// ��������
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
