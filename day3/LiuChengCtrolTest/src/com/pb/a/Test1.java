package com.pb.a;

public class Test1 {
	public static void main(String[] args) {
		int i = 0;
		int j = 0;
		// ����
		int row = 10;
		// ����
		int col = 10;
		while (true) {
			if (i > row && j > col) {
				break;// �����߽�����
			}
			if (i < row && j > col) { // ����г����߽磬��û����������
				System.out.println("");
				j = 0;// �д�0��ʼ���¼���
				i++;
//				continue;

			}
			if (i < row && j < col) {// ���ж��ڱ߽���
				if (j > i && j < row - i) {
					System.out.print("*");// ����д��ڵ����в��ң�С�ڱ߽�-��ʱ��*
				} else {
					System.out.print(" ");
				}
			}

			j++;

		}
	}
}
