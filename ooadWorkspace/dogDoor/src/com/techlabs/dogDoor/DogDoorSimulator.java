package com.techlabs.dogDoor;

public class DogDoorSimulator {

	public static void main(String[] args) {
		DogDoor dogdoor = new DogDoor();
		dogdoor.addAllowedBark(new Bark("rowlf"));
		dogdoor.addAllowedBark(new Bark("rooowlf"));
		dogdoor.addAllowedBark(new Bark("rawlf"));
		dogdoor.addAllowedBark(new Bark("woof"));
		BarkReconizer reconizer = new BarkReconizer(dogdoor);
		DoorRemote remote = new DoorRemote(dogdoor);
		System.out.println("Fido starts Braking");
		System.out.println("Fido's All Done");

		try {
			Thread.currentThread().sleep(10000);
		} catch (InterruptedException e) {
		}
		System.out.println("but he is stuck outside");
		Bark smallDogBark = new Bark("yip");
		System.out.println("A small dog starts barking.");
		reconizer.recognize(smallDogBark);
		try {
			Thread.currentThread().sleep(5000);
		} catch (InterruptedException e) {
		}
		System.out.println("Fido start barking");
		reconizer.recognize(new Bark("Rowlf"));

		System.out.println("fido back inside");
	}
}
