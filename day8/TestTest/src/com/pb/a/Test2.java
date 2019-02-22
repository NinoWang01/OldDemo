package com.pb.a;

public class Test2 {
	public static void main(String[] args) {

		GetBackTest gbt1 = new GetBackTest();
		GetBackTest gbt2 = new GetBackTest();
		gbt1 = null;
		gbt2 = null;
		new GetBackTest();
		System.gc();
		for (int i = 0; i < 10000; i++) {

		}

	}
}

  