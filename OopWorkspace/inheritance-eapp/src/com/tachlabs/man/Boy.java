package com.tachlabs.man;

public class Boy extends Man {

	public Boy() {
		super();
		System.out.println("Boy is Created");
	}
	
	public void walk() {
		System.out.println("Boy is Playing");
	}
	
	
	@Override
	public void play(){
		System.out.println("Boy is Playing");
	}
}
