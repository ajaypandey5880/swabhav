package com.techlab.college;

import java.util.ArrayList;

public class EngineeringCollege {
	private String collegeName = "svpv";
	private ArrayList<Student> student = new ArrayList<Student>();
	private ArrayList<Professor> professor = new ArrayList<Professor>();

	public ArrayList<Student> getStudent() {
		return student;
		
	}
	
	public String getcollegeName() {
		return collegeName;
	}

	public void addStudent(Student student) {
		this.student.add(student);
	}

	public ArrayList<Professor> getProfessor() {
		return professor;
		
	}

	public void addprofessor(Professor professor) {
		this.professor.add(professor);
	}

}
