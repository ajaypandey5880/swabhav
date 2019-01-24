package com.techlabs.dogDoor;

public class DogDoorSimulator {

	public static void main(String[] args) {
		DogDoor dogdoor = new DogDoor();
		BarkReconizer reconizer = new BarkReconizer(dogdoor);
		DoorRemote remote = new DoorRemote(dogdoor);
		System.out.println("Fido starts Braking");
		reconizer.recognize("Woof");
		System.out.println("Fido's All Done");

		try {
			Thread.currentThread().sleep(10000);
		} catch (InterruptedException e) {
		}

		System.out.println("but he is stuck outside");
		System.out.println("Fido start barking");
		reconizer.recognize("woof");
		System.out.println("fido back inside");
	}
}
