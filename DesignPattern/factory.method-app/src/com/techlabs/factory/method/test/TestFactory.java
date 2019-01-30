package com.techlabs.factory.method.test;

import com.techlabs.factory.method.AudiFactory;
import com.techlabs.factory.method.BmwFactory;
import com.techlabs.factory.method.IAutoFactory;
import com.techlabs.factory.method.IAutoMobile;

public abstract class TestFactory {

	public static void main(String[] args) {
		IAutoFactory autoFactory = BmwFactory.getInstance();
		IAutoMobile bmw = autoFactory.make();
		bmw.start();
		bmw.stop();
		System.out.println(bmw.getClass());
		System.out.println(AudiFactory.getInstance());
	}

}
