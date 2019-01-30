package com.techlabs.factory.method;

public class BmwFactory implements IAutoFactory{
	private static IAutoFactory instance;
	
	private BmwFactory() {
	}

	@Override
	public IAutoMobile make() {
		return new Bmw();
	}
	
	public static IAutoFactory getInstance() {
		if(instance == null) {
			instance = new BmwFactory();
		}
		return instance;
	}
	
}
