package com.pb.d;

public class ErWeiShuZuTest {

	/*
	 * ����������������ʽ(1)
	 * 
	 * ��������[ ][ ] �������; ʾ���� int[][] a; ��ά���鶨���ʽ(2)
	 * 
	 * �������� �������[][] ʾ����int a[][]; ��ά���鶨���ʽ(3)
	 * 
	 * ��������[][] �������=new ��������[][]; ʾ����float[][] a=new float[3][];
	 * 
	 * ��ά���������Ԫ���ǣ�һά����
	 */
	public static int[][] aa;
	public static int[][] str = { { 10, 2, 3, 25 }, { 11, 2, 23, 90 } };

	/*
	 * str[0][0] 10 str[0][1] 2 str[0][2] 3 str[0][3] 25
	 * 
	 * str[1][0] 11 str[1][1] 2 str[1][2] 23 str[1][3] 90
	 */
	// ������һ����ά���飬������5��Ԫ��û��
	public static int[][] cc = new int[5][];
	public static void main(String[] args) {
		// str[0]��str[1];
/*
 * public static int[][] str = { 
 * 			{ 10, 2, 3, 25 }, 
 * 			{ 11, 2, 23, 90 } 
 * 		};
 * һά���飺str[0]   ָ��{ 10, 2, 3, 25 },
 * һλ���飺str[1]   ָ��{ 11, 2, 23, 90 } 
 *
 */
			for (int j = 0; j < str[0].length; j++) {
				System.out.print(str[0][j] + "\t");
			}
			System.out.println();//�������ɻ��е�����
			for (int k = 0; k < str[1].length; k++) {
				System.out.print(str[1][k] + "\t");
			}
//			for (int i = 0; i < a.length; i++) {
//				//{ 13, 2, 333, 40, 123 };
//				for(int j=0;j<a.length-i-1;j++){
//					if (a[j] > a[j + 1]) {
//						max=a[j];
//						a[j]=a[j + 1];
//						a[j+1]=max;
//					}
//				}
//			}

	}

}
