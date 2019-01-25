package com.techlabs.dogDoor;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class DogDoor {
	private boolean open;
	private List allowedBarks = new ArrayList();

	public DogDoor() {
		this.open = false;
	}

	public void open() {
		System.out.println("The dog door is opens");
		open = true;

		final Timer timer = new Timer();
		timer.schedule(new TimerTask() {
			public void run() {
				close();
				timer.cancel();
			}
		}, 5000);
	}

	public void close() {
		System.out.println("the dog door closes");
		open = false;
	}

	public boolean isopen() {
		return open;
	}

	public void addAllowedBark(Bark bark) {
		allowedBarks.add(bark);
	}

	public List getAllowedBarks() {
		return allowedBarks;
	}
}
