package com.techlabs.factory.method;

class Bmw implements IAutoMobile {

	@Override
	public void start() {
		System.out.println("Bmw Started");
	}

	@Override
	public void stop() {
		System.out.println("Bmw Stoped");
	}

}
