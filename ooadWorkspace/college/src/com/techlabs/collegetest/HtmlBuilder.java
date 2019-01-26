package com.techlabs.collegetest;

import java.io.FileWriter;
import java.io.IOException;

import com.techlab.college.BranceOption.BranchOption;
import com.techlab.college.EngineeringCollege;
import com.techlab.college.Professor;
import com.techlab.college.Student;

public class HtmlBuilder {

	public static void main(String[] args) throws IOException {
		EngineeringCollege college = new EngineeringCollege();
		college.addStudent(new Student(1, "Mira Road", "26/11/1996", BranchOption.COMPUTER));
		college.addStudent(new Student(2, "Vasai", "22/05/1992", BranchOption.CIVIL));
		college.addStudent(new Student(3, "Dahisar", "26/11/1995", BranchOption.INFORMATION_TECHNOLOGY));
		college.addprofessor(new Professor(1, "Virar", "22/08/1885"));
		college.addprofessor(new Professor(2, "vasai", "26/04/1882"));
		printDetials(college);
	}

	public static void printDetials(EngineeringCollege college) throws IOException {
		FileWriter file = new FileWriter("D:\\swabhav-repos\\swabhav\\OopWorkspace\\college\\src\\data\\college.html", false);
		file.append("<div><h1>College name :" + college.getcollegeName() + "</h1><br><p>No of Student :"
				+ college.getStudent().size() + "<br>\tNo of Professor :" + college.getProfessor().size() + "</p>");
		file.append("<h2>Student Details</h2>");
		for (Student student : college.getStudent()) {
			file.append("<p>Id :" + student.getId() + "\tAddress :" + student.getAddress() + "\tDate of Birth :"
					+ student.getDateOfBirth() + "\tBranch :" + student.getBranch() + "</p>");
		}
		file.append("<h3>Professor</h3>");
		for (Professor professor : college.getProfessor()) {
			file.append("<p>Id :" + professor.getId() + "\tAddress :" + professor.getAddress()
					+ "\tDate of Birth :" + professor.getDateOfBirth() + "\tSalary :" + professor.getSalary() + "</p>");
		}
		file.close();
	}

}
