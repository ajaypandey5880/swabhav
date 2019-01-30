package com.techlabs.factory.method;

public class AudiFactory implements IAutoFactory{
	private static IAutoFactory instance;
	
	private AudiFactory() {
	}

	@Override
	public IAutoMobile make() {
		return new Bmw();
	}
	
	public static IAutoFactory getInstance() {
		if(instance == null) {
			instance = new AudiFactory();
		}
		return instance;
	}
}
