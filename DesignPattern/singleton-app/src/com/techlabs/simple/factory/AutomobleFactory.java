package com.techlabs.simple.factory;

public class AutomobleFactory {
	private static AutomobleFactory instance;

	private AutomobleFactory() {

	}

	public IAutoMobile make(AutoConfigType type) {
		if (type == AutoConfigType.AUDI) {
			return new Audi();
		}
		if (type == AutoConfigType.BMW) {
			return new Bmw();
		}
		return new MiniCopper();
	}

	public static AutomobleFactory getInstance() {
		instance = new AutomobleFactory();
		return instance;
	}

}
