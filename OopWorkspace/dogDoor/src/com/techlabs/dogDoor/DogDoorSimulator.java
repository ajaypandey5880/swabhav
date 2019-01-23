package com.techlabs.dogDoor;

public class DogDoorSimulator {

	public static void main(String[] args) {
		DogDoor dogdoor = new DogDoor();
		DoorRemote remote = new DoorRemote(dogdoor);
		System.out.println();
		System.out.println("fido all done..");

		try {
			Thread.currentThread().sleep(10000);
		} catch (InterruptedException e) {
		}

		System.out.println("but he is stuck outside");
		System.out.println("Fido start barking");
		System.out.println("gina grabs the remote control");
		remote.pressButton();
		System.out.println("fido back inside");
	}
}
