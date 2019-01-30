package com.techlabs.factory.method;

class Audi implements IAutoMobile {

	@Override
	public void start() {
		System.out.println("Audi Started");
	}

	@Override
	public void stop() {
		System.out.println("Audi Stoped");
	}

}
