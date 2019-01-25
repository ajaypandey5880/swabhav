package com.techlabs.hashset;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

import com.techlabs.student.Student;

public class TestTreeset implements Comparator<Student> {

	public static void main(String[] args) {
		Set<Student> student;
		//student = new TreeSet<Student>();
		//student = new TreeSet<Student>(new FirstNameCompaartor());
		student = new TreeSet<Student>(new LastNameComparator().reversed());
		Student student1 = new Student(1, "bhavesh", "patel");
		Student student2 = new Student(2, "akash", "sakariya");
		Student student3 = new Student(3, "suyesh", "tiwari");
		
		

		student.add(student1);
		student.add(student1);
		student.add(student2);
		student.add(student3);
		System.out.println(student.size());
		System.out.println(student);
	}

	@Override
	public int compare(Student o1, Student o2) {
		return o1.getfName().compareToIgnoreCase(o2.getfName());
	}
}
