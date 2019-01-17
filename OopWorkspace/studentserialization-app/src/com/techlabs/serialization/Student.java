package com.techlabs.serialization;

import java.io.*;

public class Student implements Serializable {
	private String fName;
	private String lName;

	public Student(String fName, String lName) {
		this.fName = fName;
		this.lName = lName;
	}
	public String getfName(){
		return fName;
	}
	public String getlName() {
		return lName;
	}
}
