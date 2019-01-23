package com.techlabs.dogDoor;

public class DoorRemote {
	private DogDoor dogdoor;

	public DoorRemote(DogDoor door) {
		this.dogdoor = door;
	}

	public void pressButton() {
		if (dogdoor.isopen()) {
			dogdoor.close();
		} else {
			dogdoor.open();
		}
	}
}
