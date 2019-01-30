package com.techlabs.data.analyzer;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

public class DataAnalyzer {

	private Map<String, Integer> designation;
	private Map<Integer, Integer> department;

	public Map<String, Integer> employeeCounter(TreeSet<Employee> treeSet) {
		designation = new HashMap<String, Integer>();
		for (Employee employee : treeSet) {
			designationCountSetter(employee);
		}
		return designation;
	}

	public Map<Integer, Integer> departmentCounter(TreeSet<Employee> treeSet) {
		department = new HashMap<Integer, Integer>();
		for (Employee employee : treeSet) {
			departmentCountSetter(employee);
		}
		return department;
	}
	public void designationCountSetter(Employee employee) {
		if (designation.get(employee.getDesination()) == null) {
			designation.put(employee.getDesination(), 1);
		} else {
			int count;
			count = designation.get(employee.getDesination());
			count++;
			designation.put(employee.getDesination(), count);
		}
	}
	
	public void departmentCountSetter(Employee employee) {
		if (department.get(employee.getDepartment()) == null) {
			department.put(employee.getDepartment(), 1);
		} else {
			int count;
			count = department.get(employee.getDepartment());
			count++;
			department.put(employee.getDepartment(), count);
		}
	}
	
	public String MaxSalariedEmployee(TreeSet<Employee> employee) {
		TreeSet<Employee> employeelist = new TreeSet<Employee>(new MaxSalary());
 		employeelist.addAll(employee);
 		return employeelist.last().getEmployeeName()+""+employeelist.last().getSalary();
	}
	
}