package com.pb.b;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class EnterFileReWri_Test {

	public static void main(String[] args) {
		File file = new File("d:/haohao/cc03/true.txt");
		File file2 = new File("d:/haohao/cc03/hao.txt");
		try {
			// ���ļ��Ķ���
			FileReader reader = new FileReader(file);
			// ����һ��������
			BufferedReader br = new BufferedReader(reader);// ������Ƕ��Ļ�����
			// ��д���ַ����ļ�����
			FileWriter writer;
			writer = new FileWriter(file2);
			// ����һ���������
			BufferedWriter bw = new BufferedWriter(writer);// �����д�Ļ�����
			// ���ն�ȡ��ʱ���һ�е�����
			String str;
			// ��һ�ζ�һ��
			while ((str = br.readLine()) != null) {
				// дһ��дһ��
				bw.write(str);
				bw.newLine();// ���ݵ�ǰ�������ϵͳ�����һ�����ʵĻ��з�
			}
			br.close();
			bw.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
