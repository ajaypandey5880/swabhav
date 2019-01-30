package com.techlabs.factory.method;

class MiniCooper implements IAutoMobile {

	@Override
	public void start() {
		System.out.println("MINI Cooper Started");
	}

	@Override
	public void stop() {
		System.out.println("MINI Cooper Stoped");
	}

}
