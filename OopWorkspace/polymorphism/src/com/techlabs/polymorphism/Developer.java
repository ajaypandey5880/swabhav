package com.techlabs.polymorphism;

public class Developer extends Employee {
	public Developer(int empNo, String name) {
		super(empNo, name);
	}

	@Override
	public void calculateSalary() {
		performanceAllowance = 0.4 * basicSalary;
		salary = performanceAllowance + basicSalary;
	}

}
