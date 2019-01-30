package com.techlabs.factory.method;

public class MiniCooperFactory implements IAutoFactory{
	private static IAutoFactory instance;
	
	private MiniCooperFactory() {
	}

	@Override
	public IAutoMobile make() {
		return new Bmw();
	}
	
	public static IAutoFactory getInstance() {
		if(instance == null) {
			instance = new MiniCooperFactory();
		}
		return instance;
	}
}
