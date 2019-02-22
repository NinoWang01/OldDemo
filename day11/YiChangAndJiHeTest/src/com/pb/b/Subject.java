package com.pb.b;

public class Subject {

	public int java;
	public int android;
	public int oracle;
	public int php;

	public Subject(int java, int android, int oracle, int php) {
		super();
		this.java = java;
		this.android = android;
		this.oracle = oracle;
		this.php = php;
	}

	public int getJava() {
		return java;
	}

	public void setJava(int java) {
		this.java = java;
	}

	public int getAndroid() {
		return android;
	}

	public void setAndroid(int android) {
		this.android = android;
	}

	public int getOracle() {
		return oracle;
	}

	public void setOracle(int oracle) {
		this.oracle = oracle;
	}

	public int getPhp() {
		return php;
	}

	public void setPhp(int php) {
		this.php = php;
	}

	@Override
	public String toString() {
		return "Subject [java=" + java + ", android=" + android + ", oracle="
				+ oracle + ", php=" + php + "]";
	}

}
