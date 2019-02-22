package com.pb.b;

public class Cat extends Animal {

	/*
	 * 继承，如果说父类中有构造方法，那么子类在继承的时候， 必须也要继承父类的构造方法， 普通方法对于子类而言可继承可以不继承，都不会影响在类的实例，对
	 * 普通方法的调用，（先到子类中查，如果有直接调用，如果没有就去 父类中找，找到直接用）
	 */

	public Cat(String name, String kind) {
		// super(name, kind);
		super("ABC", "123");

	}

	// 属性和方法
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

	// 重写父类的方法,子类继承重写了父类的方法，然后又进一步扩展了
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
