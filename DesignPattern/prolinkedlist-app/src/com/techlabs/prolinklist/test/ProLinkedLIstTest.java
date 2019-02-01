package com.techlabs.prolinklist.test;

import com.techlabs.prolinklist.ProLinkedLIst;
import com.techlabs.prolinklist.Student;

public class ProLinkedLIstTest {

	public static void main(String[] args) {
		Student student = new Student("ajay");
		Student student1 = new Student("kedar");
		Student student2 = new Student("gaurang");
		Student student3 = new Student("prachit");
		ProLinkedLIst<Student>  prolink = new  ProLinkedLIst<Student>(student);
		prolink.add(student1);
		prolink.add(student2);
		prolink.add(student3);
		prolink.print();
		prolink.deleteNodeWithElement(student1);
		prolink.print();
		
	}

}
