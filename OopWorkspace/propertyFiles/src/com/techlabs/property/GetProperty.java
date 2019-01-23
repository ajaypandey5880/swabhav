package com.techlabs.property;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class GetProperty {

	public static void main(String[] args) throws IOException {
		FileReader reader = new FileReader("D:\\swabhav-repos\\swabhav\\OopWorkspace\\propertyFiles\\src\\data\\File.Properties");

		Properties properties = new Properties();
		properties.load(reader);

		System.out.println(properties.getProperty("Roll No"));
		System.out.println(properties.getProperty("Address"));
	}
}
