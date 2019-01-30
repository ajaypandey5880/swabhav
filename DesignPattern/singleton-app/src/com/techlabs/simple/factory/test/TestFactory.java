package com.techlabs.simple.factory.test;

import com.techlabs.simple.factory.AutoConfigType;
import com.techlabs.simple.factory.AutomobleFactory;
import com.techlabs.simple.factory.IAutoMobile;

public class TestFactory {

	public static void main(String[] args) {
		AutomobleFactory factory = AutomobleFactory.getInstance();
		IAutoMobile audi = factory.make(AutoConfigType.AUDI);
		audi.start();
		audi.stop();
		System.out.println(audi.getClass());
	}

}
