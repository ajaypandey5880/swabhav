package com.techlabs.data.analyzer.test;

import java.io.IOException;

import com.techlabs.data.analyzer.DataAnalyzer;
import com.techlabs.data.analyzer.DiskLoader;
import com.techlabs.data.analyzer.Parser;

public class DataAnalyzerTest {

	public static void main(String[] args) throws IOException {
		DataAnalyzer analyzer = new DataAnalyzer();
		analyzer.employeeCounter(new Parser().parse(new DiskLoader("D:\\programs\\dataFile.txt")));
		System.out.println(analyzer.employeeCounter(new Parser().parse(new DiskLoader("D:\\programs\\dataFile.txt"))));
		System.out.println(analyzer.departmentCounter(new Parser().parse(new DiskLoader("D:\\programs\\dataFile.txt"))));
		System.out.println(analyzer.MaxSalariedEmployee(new Parser().parse(new DiskLoader("D:\\programs\\dataFile.txt"))));
		
	

	}
	

}
