package com.techlabs.property;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class AddProperties {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Properties properties = new Properties();
		properties.setProperty("Roll No", "1");
		properties.setProperty("Address", "Miraroad");
		FileWriter file = new FileWriter(
				"D:\\swabhav-repos\\swabhav\\OopWorkspace\\propertyFiles\\src\\data\\File.Properties");
		properties.store(file, "store");
	}
}
