package com.techlabs.employee.test;

import java.util.HashMap;
import java.util.Map;

import com.techlabs.employee.Employee;

public class TestHashmap {

	public static void main(String[] args) {
		Map<Employee, Employee> employee;

		employee = new HashMap<Employee, Employee>();
		Employee employee1 = new Employee(101, 10, "vipul", "patel", 5000);
		Employee employee2 = new Employee(101, 10, "ajay", "pandey", 3000);
		Employee employee3 = new Employee(101, 20, "gaurang", "kadam", 8000);

		employee.put(employee1, employee1);
		employee.put(employee2, employee2);
		employee.put(employee3, employee3);

		System.out.println(employee.size());
		System.out.println(employee);
		for (Map.Entry<Employee, Employee> entry : employee.entrySet())
			System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
	}

}
