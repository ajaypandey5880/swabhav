package reflection;

import java.lang.reflect.*;

public class TestClassReflection {
	public static void main(String[] args) throws SecurityException {
		ClassReflection classReflect = new ClassReflection();
		Class<?> c1 = classReflect.getClass();
		Method[] method = c1.getDeclaredMethods();
		Constructor[] constructor = c1.getDeclaredConstructors();
		classReflect.countGetterOrSetter(method, "get");
		classReflect.countGetterOrSetter(method, "set");
		classReflect.noOFMethod(method);
		// classReflect.showMethods(method);
		// classReflect.showConstructor(constructor);
		classReflect.noOfConstructor(constructor);

	}

}
