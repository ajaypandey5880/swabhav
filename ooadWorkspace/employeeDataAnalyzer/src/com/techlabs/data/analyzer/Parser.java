package com.techlabs.data.analyzer;

import java.io.IOException;
import java.util.TreeSet;

public class Parser {
	public Employee employee;
	public TreeSet<Employee>  employees = new TreeSet<Employee>();

	public TreeSet<Employee> parse(ILoader iLoader) throws IOException {
		for (String line : iLoader.load()) {
			String[] employeeDetail = line.split(",");
			employee = new Employee();
			employee.setEmployeeId(Integer.parseInt(employeeDetail[0]));
			employee.setEmployeeName(employeeDetail[1]);
			employee.setDesination(employeeDetail[2]);
			employee.setManagerId(employeeDetail[3]);
			employee.setDate(employeeDetail[4]);
			employee.setSalary(Integer.parseInt(employeeDetail[5]));
			employee.setCommision(employeeDetail[6]);
			employee.setDepartment(Integer.parseInt(employeeDetail[7]));
			employees.add(employee);
		}
		return employees;
	}
}
