package com.techlabs.factory.method.test;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import com.techlabs.factory.method.IAutoFactory;
import com.techlabs.factory.method.IAutoMobile;
import com.techlabs.factory.method.PropertyFile;

public class TestFactoryProperty {

	public static void main(String[] args) throws IOException, ClassNotFoundException, InstantiationException,
	IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, 
	InvocationTargetException{
		PropertyFile file = new PropertyFile();
		//Class<IAutoFactory> class1 = (Class<IAutoFactory>) Class.forName(file.makeObjectFile());
		Class class1 = Class.forName(file.makeObjectFile());
		//IAutoFactory factory = (IAutoFactory)class1.newInstance();
		Method method = class1.getDeclaredMethod("getInstance");
		IAutoFactory factory2 = (IAutoFactory) method.invoke(null, null);
		IAutoMobile Audi = factory2.make();
		Audi.start();
		Audi.stop();
	}
}
