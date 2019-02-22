package com.pb.a;

public class Test1 {

	/**
	 * 已知三名牌手：张飞、王菲和刘亦菲。 将红桃3～红桃A依次发给这三个牌手。
	 */

	public static void main(String[] args) {
		String[] cards = { "红桃3", "红桃4", "红桃5", "红桃6", "红桃8", "红桃7", "红桃10",
				"红桃J", "红桃Q", "红桃K", "红桃J", "红桃2" };
		String[] players = { "张飞", "王菲", "刘亦飞" };
		/*
		 * players[i % 3]
		 */

		for (int i = 0; i < cards.length; i++) {
			System.out.println(players[i % 3] + ":" + cards[i]);
		}
		System.out.println(cards.length);

	}

}
