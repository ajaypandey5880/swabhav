package com.techlab.college;

import java.util.Date;

public class Professor extends Person implements SalariedEmployee {
	public Professor(int id, String address, String dateofBirth) {
		super(id, address, dateofBirth);
	}

	private double salary;
	private double incentive;

	public double getSalary() {
		salaryCalculation(this);
		return salary;
	}

	@Override
	public void salaryCalculation(SalariedEmployee employee) {
		incentive = 0.5 * BASICSALARY;
		salary = BASICSALARY + incentive;
	}

}
