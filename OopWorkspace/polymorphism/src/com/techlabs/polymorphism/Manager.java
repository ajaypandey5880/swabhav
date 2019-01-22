package com.techlabs.polymorphism;

public class Manager extends Employee {

	public Manager(int empNo, String name) {
		super(empNo, name);
	}

	@Override
	public void calculateSalary() {
		houseRentalAllowance = 0.6 * basicSalary;
		travellingAllowance = 0.4 * basicSalary;
		salary = basicSalary + houseRentalAllowance + travellingAllowance;
	}

}
