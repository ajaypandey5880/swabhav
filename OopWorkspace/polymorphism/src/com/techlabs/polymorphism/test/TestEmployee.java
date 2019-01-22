package com.techlabs.polymorphism.test;

import com.techlabs.polymorphism.Accountant;
import com.techlabs.polymorphism.Developer;
import com.techlabs.polymorphism.Employee;
import com.techlabs.polymorphism.Manager;

public class TestEmployee {

	public static void main(String[] args) {
		Manager manager = new Manager(1, "ajay");
		Accountant accountant = new Accountant(2, "akash");
		Developer developer = new Developer(3, "suyesh");
		
		printDetails(developer);
		printDetails(accountant);
		printDetails(manager);
	}

	public static void printDetails(Employee employee) {
		employee.calculateSalary();
		System.out.println("Name of Employee :" + employee.getName() + "\nEmployee ID :" + employee.getEmpNo()
				+ "\nBasic Salary :" + employee.getBasicSalary());
		if (employee.gethouseRentalAllowance() != 0) {
			System.out.println("House Rental Allowance :" + employee.gethouseRentalAllowance());
			System.out.println("Travelling Allowance :" + employee.gettravellingAllowance());
		}
		if (employee.getperks() != 0) {
			System.out.println("Perks :"+employee.getperks());
		}
		if (employee.getPerformanceAllowance() != 0) {
			System.out.println("Personal Allowance :"+employee.getPerformanceAllowance());
		}
		System.out.println("Total Salary :"+employee.getSalary());
	}

}
