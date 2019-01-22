package com.techlabs.man;

public class Boy implements IMannerable,IEmotional{

	@Override
	public void cry() {
		System.out.println("Crying");
	}

	@Override
	public void laugh() {
		System.out.println("laughing");
	}

	@Override
	public void wish() {
		System.out.println("Hello");
	}

	@Override
	public void depart() {
		System.out.println("Bye");
	}
	
}
