package com.pb.a;


//һ�������ֱ�ӵ�����������Ժͷ���
public class Person {
	/*
	 * private:���������Ժͷ����ģ�ֻ������
	 * �������εĶ���˽�еģ��������������޷�����
	 */
	String name;// ����,�ǲ���һ������
	char sex;// �Ա�
	int age;// ����
	double height;// ���
	String type;// �Ը�
	
	
	
	//��� setName����ֵ
	public String getName() {
		return name;
	}
	//��������Ǹ�name��ֵ��
	public void setName(String name) {
		this.name = name;
	}
	public char getSex() {
		return sex;
	}
	public void setSex(char sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	//�Է��ķ���
	public void eat(String s){
		System.out.println("��Է���û��");
	}
	
	
	
	
	
	
	
	

}
