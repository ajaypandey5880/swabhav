package com.techlab.college;

import java.util.Date;

import com.techlab.college.BranceOption.BranchOption;

public class Student extends Person {
	public Student(int id, String address, String dateofBirth, BranchOption branch) {
		super(id, address, dateofBirth);
		this.branch = branch;
	}

	private BranchOption branch;

	public BranchOption getBranch() {
		return branch;
	}

}
