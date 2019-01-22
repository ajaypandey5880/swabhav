package com.techlabs.polymorphism;

public abstract class Employee {
	private int empNo;
	private String name;
	protected int basicSalary;
	protected double salary;
	protected double perks;
	protected double performanceAllowance;
	protected double houseRentalAllowance;
	protected double travellingAllowance;

	public Employee(int empNo, String name) {
		this.empNo = empNo;
		this.name = name;
		this.basicSalary = 10000;
	}

	public abstract void calculateSalary();

	public int getEmpNo() {
		return empNo;
	}

	public String getName() {
		return name;
	}

	public int getBasicSalary() {
		return basicSalary;
	}

	public double getSalary() {
		return salary;
	}

	public double getperks() {
		return perks;
	}

	public double getPerformanceAllowance() {
		return performanceAllowance;
	}

	public double gethouseRentalAllowance() {
		return houseRentalAllowance;
	}

	public double gettravellingAllowance() {
		return travellingAllowance;
	}
}
