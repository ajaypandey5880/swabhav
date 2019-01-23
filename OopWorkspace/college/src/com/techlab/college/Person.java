package com.techlab.college;

public class Person {
	protected int id;
	protected String address;
	protected String dateOfBirth;

	public Person(int id, String address, String dateofBirth) {
		this.id = id;
		this.address = address;
		this.dateOfBirth = dateofBirth;
	}

	public int getId() {
		return id;
	}

	public String getAddress() {
		return address;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}
}
