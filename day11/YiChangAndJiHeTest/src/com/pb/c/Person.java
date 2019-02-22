package com.pb.c;

public class Person {
	private int age;
	public String name;
	public String sexx;

	public Person() {

	}

	public Person(int age, String name, String sexx) {
		this.age = age;
		this.name = name;
		this.sexx = sexx;

	}

	@Override
	public int hashCode() {
		return name.hashCode();
		/*
		 * hashCode，指向存储数据的那个地址，
		 * 通过equals这个方法去判断，在那个位置的上值是否相等，如果相等，
		 * set集合就不允许存进集合中
		 * 
		 */
	}

	@Override
	public boolean equals(Object obj) {

		if (this == obj) {
			return true;
		}

		if (!(obj instanceof Person)) {
			return false;
		}

		Person p = (Person) obj;
		/*
		 * 注意一点类属性的数据类型
		 */
		boolean isRight = this.name.equals(p.name);

		return isRight;

	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSexx() {
		return sexx;
	}

	public void setSexx(String sexx) {
		this.sexx = sexx;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "年龄：" + this.age + "\t" + "姓名：" + this.name + "\t" + "性别："
				+ this.sexx;
	}

}
