package annotations.app;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestBar {
	static int passcount = 0;
	static int failcount = 0;

	public static void main(String[] args)
			throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
		Bar b = new Bar();
		Class bar = b.getClass();
		Method[] method = bar.getDeclaredMethods();

		for (int i = 0; i < method.length; i++) {
			pass(method[i],b);

		}
		System.out.println(passcount);
		System.out.println(failcount);
	}
	public static void pass(Method method, Bar b) throws IllegalAccessException, IllegalArgumentException, 
					InvocationTargetException {
		

		if (method.isAnnotationPresent(ProTestCase.class)) {
			checkTrueFalse(method,b);
		}
	}
	public static int checkTrueFalse(Method method, Bar b) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		 if(((boolean)method.invoke(b, null))){
			 passcount++;
			 return passcount;
		 }
		 failcount++;
		 return failcount;
	}

}
