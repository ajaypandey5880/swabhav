package reflection;

import java.lang.reflect.*;

public class TestClassReflection {
	private int countMethod;
	private int countConstructor;
	private int countGetterSetter;

	public static void main(String[] args) throws SecurityException {
		ClassReflection classReflect = new ClassReflection();
		Class<?> c1 = classReflect.getClass();
		Method[] method = c1.getDeclaredMethods();
		for (Method meth : method) {
			System.out.println(meth);

		}
		Constructor[] constructor = c1.getDeclaredConstructors();
		for (Constructor con : constructor) {
			System.out.println(con);
		}
	}

}
