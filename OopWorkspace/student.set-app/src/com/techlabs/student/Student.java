package com.techlabs.student;

import java.util.Comparator;

public class Student implements Comparable<Student> {
	private int rollNo;
	private String fName;
	private String lName;

	public int getRollNo() {
		return rollNo;
	}

	public Student(int rollNo, String fName, String lName) {
		this.rollNo = rollNo;
		this.fName = fName;
		this.lName = lName;
	}

	public String getfName() {
		return fName;
	}

	public String getlName() {
		return lName;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((fName == null) ? 0 : fName.hashCode());
		result = prime * result + ((lName == null) ? 0 : lName.hashCode());
		result = prime * result + rollNo;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (fName == null) {
			if (other.fName != null)
				return false;
		} else if (!fName.equals(other.fName))
			return false;
		if (lName == null) {
			if (other.lName != null)
				return false;
		} else if (!lName.equals(other.lName))
			return false;
		if (rollNo != other.rollNo)
			return false;
		return true;
	}

	@Override
	public String toString() {
		
		return this.lName;
	}

	@Override
	public int compareTo(Student student) {
		if(this.rollNo<student.rollNo) {
			return -1;
		}
		if(this.rollNo>student.rollNo) {
			return 1;
		}
		return 0;
	}

	

}
