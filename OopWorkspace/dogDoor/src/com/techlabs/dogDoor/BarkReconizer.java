package com.techlabs.dogDoor;

import java.util.Iterator;
import java.util.List;

public class BarkReconizer {
	private DogDoor door;

	public BarkReconizer(DogDoor door) {
		this.door = door;
	}

	public void recognize(Bark bark) {
		System.out.println("BarkReconizer:Heard a"+bark.getSound());
		List allowedBarks = door.getAllowedBarks();
		for (Iterator i = allowedBarks.iterator(); i.hasNext(); ) {
			Bark allowedBark = (Bark)i.next();
			if (allowedBark.equals(bark)) {
				door.isopen();
				return;
			}
		}
		System.out.println("this bark is not allowed");
	}
}
