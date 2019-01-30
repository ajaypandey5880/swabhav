package com.techlabs.simple.factory;

class Bmw implements IAutoMobile {

	@Override
	public void start() {
		System.out.println("BMW Starting");
	}

	@Override
	public void stop() {
		System.out.println("BMW Stoping");
	}

}
