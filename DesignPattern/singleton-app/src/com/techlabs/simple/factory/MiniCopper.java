package com.techlabs.simple.factory;

class MiniCopper implements IAutoMobile {

	@Override
	public void start() {
		System.out.println("Mini Copper Starting");
	}

	@Override
	public void stop() {
		System.out.println("Mini Cooper Stoping");
	}

}
