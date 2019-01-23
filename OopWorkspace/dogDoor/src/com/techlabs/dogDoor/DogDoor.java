package com.techlabs.dogDoor;

public class DogDoor {
	private boolean open;

	public DogDoor() {
		this.open = false;
	}

	public void open() {
		System.out.println("The dog door is opens");
		open = true;
	}

	public void close() {
		System.out.println("the dog door closes");
		open = false;
	}

	public boolean isopen() {
		return open;
	}
}
