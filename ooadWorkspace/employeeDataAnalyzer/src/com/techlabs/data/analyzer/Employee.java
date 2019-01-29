package com.techlabs.data.analyzer;

public class Employee implements Comparable<Employee>{
	private int employeeId;
	private String employeeName;
	private String desination;
	private String managerId;
	private String joiningDate;
	private double salary;
	private int department;
	private String commision;

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getDesination() {
		return desination;
	}

	public void setDesination(String desination) {
		this.desination = desination;
	}

	public String getManagerId() {
		return managerId;
	}

	public void setManagerId(String managerId) {
		this.managerId = managerId;
	}

	public String getDate() {
		return joiningDate;
	}

	public void setDate(String date) {
		this.joiningDate = date;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getDepartment() {
		return department;
	}

	public void setDepartment(int department) {
		this.department = department;
	}

	public String getCommision() {
		return commision;
	}

	public void setCommision(String commision) {
		this.commision = commision;
	}

	@Override
	public int compareTo(Employee o) {
		return this.employeeId - o.getEmployeeId();
	}

}
