package com.pb.a;

public class YiWeiShuZu {
	/*
	 * һλ������������� int:��������� []���ز����� a�������������������
	 */
	public static int[] a;
	/*
	 * ���ֶ����ʽ��C���Եķ�� ��Ŀ���Ǽ���C���Ե��﷨��ʽ�� ������ʹ�����ֶ��巽ʽ��
	 */
	public static int b[];
	/*
	 * ��������ķ�ʽ���� new int[5]:������һ��������� [5]�����������5��Ԫ�أ��������Ԫ�ز�����
	 * �������JVM������������Ԫ��Ĭ�ϸ�ֵ
	 * 
	 * ��ʼ��δ��ֵ������Ԫ�ع��� int �������ͳ�ʼ��Ϊ0; double �������ͳ�ʼ��Ϊ0.0�� char
	 * �ַ����ͳ�ʼ��Ϊunicode��Ϊ1���ַ��� boolean ���ͳ�ʼ��Ϊfalse�� String ���ͳ�ʼ��Ϊnull��
	 */

	public int[] c = new int[5];

	// public String[] d = new String[5];

	/*
	 * �����鶯̬��ֵ
	 * 
	 * new int[]{1,2,3,4,5}��Ҳ�����ڴ�����������ʱ�� ͨ������������̬��ÿһ��Ԫ�ظ�ֵ
	 */
	public static int[] f = new int[] { 1, 2, 3, 4, 5 };

	/*
	 * �����龲̬��ֵ�� { 10, 20, 30, 40, 50}:ͨ�����ַ�ʽ��̬�����鸳ֵ ��̬��ֵ��һ�㶼�������£���Ϊȫ�ֱ�������
	 */
	public static int[] g = { 10, 20, 30, 40, 50 };

	public static void main(String[] args) {

		/*
		 * ������ f.length��ָ��������ĳ��ȣ�
		 * ֻ��length������ԣ�
		 *  û��length����������� 
		 *  String :
		 * ����length������ԣ� Ҳ��length�����������
		 */
		for (int i = 0; i < f.length; i++) {
			System.out.println(f[i]);
		}

		/*
		 * ��̬��������
		 *  print(new int[] { 55, 88, 72 })��
		 * ��Ϊһ�������Ĳ���
		 * //int[] scores=new int[] { 55, 88, 72 }
		 */
		print(new int[] { 55, 88, 72 });

	}

	public static void hao() {
		// ��̬��ֵ�����飬����ֱ���������ĵط�ʹ��
		int[] h = new int[] { 1, 2, 3, 4, 5 };

	}

	
	public static void print(int[] scores) {
		// ��ӡ����scores�и�Ԫ�ص�ֵ
	}

}
