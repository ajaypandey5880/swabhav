package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class ClassReflection {
	private String name;
	private String college;
	private String company;

	public void setname(String candidateName) {
		name = candidateName;
	}

	public void setcompany(String candidateCompany) {
		company = candidateCompany;
	}

	public ClassReflection() {
		college = "Universal";
	}

	public void print() {
		System.out.println("Name of Candidate is " + name + "Company of Candidate is " + company
				+ "College of Candidate is " + college);
	}

	public String getName() {
		return name;
	}

	public String getCompany() {
		return company;
	}

	public String getCollege() {
		return college;
	}

	public void countGetterOrSetter(Method[] method,String s) {
		int count = 0;
		for (int i = 0; i < method.length; i++) {
			if (method[i].getName().startsWith(s)) {
				count++;
			}
		}
		System.out.println("no of "+s+" methods are " + count);
	}

	public void showMethods(Method[] method) {
		for (Method meth : method) {
			System.out.println(meth);
		}
	}

	public void showConstructor(Constructor[] constructor) {
		for (Constructor con : constructor) {
			System.out.println(con);
		}
	}
	public void noOFMethod(Method[] method) {
	System.out.println("no of Decalred methods are " + method.length);
	}
	public void noOfConstructor(Constructor[] constructor) {
		System.out.println("no of Declared Constructor are"+ constructor.length);
	}
}
