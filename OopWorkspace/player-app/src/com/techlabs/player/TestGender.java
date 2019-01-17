package com.techlabs.player;

public class TestGender {

	public static void main(String[] args) {
		Player player = new Player("ajay");
		Player player1 = new Player("vinod", 18, GenderOptions.MAlE);
		Player player2 = player.Elder(player1);
		// printDetails(player);
		// printDetails(player1);
		printDetails(player2);

	}

	private static void printDetails(Player player) {
		System.out.println(
				"name is " + player.getName() + "\nage is " + player.getAge() + "\ngender is " + player.getGender());

	}

}
