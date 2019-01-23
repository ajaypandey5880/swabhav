package com.techlabs.collegetest;

import com.techlab.college.BranceOption.BranchOption;
import com.techlab.college.EngineeringCollege;
import com.techlab.college.Person;
import com.techlab.college.Professor;
import com.techlab.college.Student;

public class TestCollege {

	public static void main(String[] args) {
		EngineeringCollege college = new EngineeringCollege();
		college.addStudent(new Student(1, "Mira Road", "26/11/1996", BranchOption.COMPUTER));
		college.addStudent(new Student(2, "Vasai", "22/05/1992", BranchOption.CIVIL));
		college.addprofessor(new Professor(1, "Virar", "22/08/1885"));
		printDetials(college);
	}

	public static void printDetials(EngineeringCollege college) {
		System.out.println("College name :" + college.getcollegeName() + "\tNo of Student :"
				+ college.getStudent().size() + "\tNo of Professor :" + college.getProfessor().size());
		System.out.println("Student Details");
		for (Student student: college.getStudent()) {
			System.out.println("Id :"+student.getId()+"\tAddress :"+student.getAddress()+"\tDate of Birth :"+student.getDateOfBirth()+"\tBranch :"
					+student.getBranch());
		}
		System.out.println("Professor");
		for (Professor professor: college.getProfessor()) {
			System.out.println("Id :"+professor.getId()+"\tAddress :"+professor.getAddress()+"\tDate of Birth :"+professor.getDateOfBirth()+"\tSalary :"
					+professor.getSalary());
		}
	}

}
