package com.techlabs.polymorphism;

public class Accountant extends Employee {
	public Accountant(int empNo, String name) {
		super(empNo, name);
	}

	@Override
	public void calculateSalary() {
		perks = 0.3 * basicSalary;
		salary = basicSalary + perks;
	}

}
