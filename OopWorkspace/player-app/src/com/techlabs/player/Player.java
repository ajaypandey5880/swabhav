package com.techlabs.player;

public class Player {
	private String name;
	private int age;
	private GenderOptions gender;

	public Player(String name, int age, GenderOptions gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;

	}

	public Player(String name) {

		this(name, 18, GenderOptions.MAlE);

	}

	public GenderOptions getGender() {
		return gender;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public Player Elder(Player player) {
		if (this.age > player.age) {
			return this;
		}
		return player;
	}

}
