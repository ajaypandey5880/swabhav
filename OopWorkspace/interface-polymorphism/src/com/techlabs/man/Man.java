package com.techlabs.man;

public class Man implements IMannerable {

	@Override
	public void wish() {
		System.out.println("Hello");
	}

	@Override
	public void depart() {
		System.out.println("Bye");
	}

}
