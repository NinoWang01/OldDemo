package com.pb.c;


import java.util.Arrays;

public class Test2 {

	/*
	 * ����������һ��һά����,
	 * ��Ҫ��[]���޶���
	 * 
		�����ʽ(1)
		����[ ]  �����������
		ʾ����int[ ]  scores;
		
		�����ʽ(2)
		����  ���������[ ];
		int a [ ];
		���ֶ����ʽ��C���Եķ��Ŀ���Ǽ���C���Ե��﷨��ʽ��������ʹ�����ֶ��巽ʽ��
		
		�����ʽ(3)
		����[ ]  ���������=new ����[��������];//�޶�����ĳ���
		ʾ����int[ ]  scores=new  int[5]; 
	 */
	public static int[] array_list = new int[5];

	public static void main(String[] args) {
		array_list[0] = 12;
		array_list[1] = 34;
		array_list[2] = 6;
		array_list[3] = 2;
		array_list[4] = 657;

		// �����ṩ��һ�����򷽷�
		Arrays.sort(array_list);
		for (int i = 0; i < array_list.length; i++) {
			System.out.println(array_list[i]);
		}

		String ss = Arrays.toString(array_list);

		System.out.println(ss);

	}
}
