package com.pb.a;

public class Test1 {

	/**
	 * ��֪�������֣��ŷɡ����ƺ�����ơ� ������3������A���η������������֡�
	 */

	public static void main(String[] args) {
		String[] cards = { "����3", "����4", "����5", "����6", "����8", "����7", "����10",
				"����J", "����Q", "����K", "����J", "����2" };
		String[] players = { "�ŷ�", "����", "�����" };
		/*
		 * players[i % 3]
		 */

		for (int i = 0; i < cards.length; i++) {
			System.out.println(players[i % 3] + ":" + cards[i]);
		}
		System.out.println(cards.length);

	}

}
