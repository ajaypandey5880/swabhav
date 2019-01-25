package com.techlabs.employee;

public class Employee implements Comparable<Employee>{
	private int depNo;
	private int empNo;
	private String firstName;
	private String lastName;
	private double salary;

	public Employee(int depNo, int empNo, String firstName, String lastName, double salary) {
		this.depNo = depNo;
		this.empNo = empNo;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
	}

	public int getDepNo() {
		return depNo;
	}

	public void setDepNo(int depNo) {
		this.depNo = depNo;
	}

	public int getEmpNo() {
		return empNo;
	}

	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + depNo;
		result = prime * result + empNo;
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
		Employee other = (Employee) obj;
		if (depNo != other.depNo)
			return false;
		if (empNo != other.empNo)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return this.getFirstName();
	}

	@Override
	public int compareTo(Employee employee) {
		if (this.empNo==employee.getEmpNo() && this.depNo==employee.getDepNo()) {
			return 0;
		}
		if (this.empNo<employee.getEmpNo() && this.depNo==employee.getDepNo()) {
			return -1;
		}
		return 1;
		
	}

}
