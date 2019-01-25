package com.techlabs.hashset;

import java.util.HashSet;
import java.util.Set;

import com.techlabs.student.Student;

public class TestHashset {

	public static void main(String[] args) {
		Set<Student> student;
		student = new HashSet<Student>();
		Student student1 = new Student(1, "akash", "sakariya");
		Student student2 = new Student(1, "akash", "sakariya");

		student.add(student1);//reference equality and content equality
		student.add(student1);
		student.add(student2);
		System.out.println(student.size());
		System.out.println(student1.hashCode());
		System.out.println(student2.hashCode());

	}

}
