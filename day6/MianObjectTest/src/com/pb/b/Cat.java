package com.pb.b;

public class Cat extends Animal {

	/*
	 * �̳У����˵�������й��췽������ô�����ڼ̳е�ʱ�� ����ҲҪ�̳и���Ĺ��췽���� ��ͨ��������������Կɼ̳п��Բ��̳У�������Ӱ�������ʵ������
	 * ��ͨ�����ĵ��ã����ȵ������в飬�����ֱ�ӵ��ã����û�о�ȥ �������ң��ҵ�ֱ���ã�
	 */

	public Cat(String name, String kind) {
		// super(name, kind);
		super("ABC", "123");

	}

	// ���Ժͷ���
	public String miaoMiao;
	public String lingXing;

	public String getMiaoMiao() {
		return miaoMiao;
	}

	public void setMiaoMiao(String miaoMiao) {
		this.miaoMiao = miaoMiao;
	}

	public String getLingXing() {
		return lingXing;
	}

	public void setLingXing(String lingXing) {
		this.lingXing = lingXing;
	}

	// ��д����ķ���,����̳���д�˸���ķ�����Ȼ���ֽ�һ����չ��
	@Override
	public void hao() {
		/*
		 * public String name; public int age; public String sex; public String
		 * kind;
		 */

		System.out.println(super.name + " " + super.age + " " + super.kind
				+ " " + super.sex + this.lingXing + " " + this.miaoMiao);

	}

}
