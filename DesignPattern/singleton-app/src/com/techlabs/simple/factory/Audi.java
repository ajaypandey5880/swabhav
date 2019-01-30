package com.techlabs.simple.factory;

class Audi implements IAutoMobile {

	@Override
	public void start() {
		System.out.println("Audi Staring");
	}

	@Override
	public void stop() {
		System.out.println("Audi Stoping");
	}

}
