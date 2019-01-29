package com.techlabs.data.analyzer.test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

import com.techlabs.data.analyzer.DataAnalyzer;
import com.techlabs.data.analyzer.DiskLoader;
import com.techlabs.data.analyzer.Employee;
import com.techlabs.data.analyzer.MaxSalary;
import com.techlabs.data.analyzer.Parser;

public class DataAnalyzerTest {

	public static void main(String[] args) throws IOException {
		Parser parse = new Parser();
		DataAnalyzer analyzer = new DataAnalyzer();
		analyzer.employeeCounter(new Parser().parse(new DiskLoader("D:\\programs\\dataFile.txt")));
		System.out.println(analyzer.employeeCounter(new Parser().parse(new DiskLoader("D:\\programs\\dataFile.txt"))));
		System.out.println(analyzer.departmentCounter(new Parser().parse(new DiskLoader("D:\\programs\\dataFile.txt"))));
		MaxSalary maxSalary = new MaxSalary();
		ArrayList<Employee> emp = new ArrayList<Employee>(parse.employees);
		Collections.sort(emp,maxSalary);
		System.out.println(emp);
		
		
	


	}

}
