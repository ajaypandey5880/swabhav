package com.techlabs.dogDoor;

public class BarkReconizer {
	private DogDoor door;

	public BarkReconizer(DogDoor door) {
		this.door = door;
	}
	public void recognize(String bark) {
		System.out.println("BarkReconizer:Heard a" +bark);
		door.isopen();
	}
}
