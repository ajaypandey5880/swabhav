package com.techlabs.factory.method;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyFile {

	public String makeObjectFile() throws IOException {
		Properties property = new Properties();
		try {
		FileInputStream input = new FileInputStream(
				"D:\\swabhav-repos\\swabhav\\DesignPattern\\factory.method-app\\src\\data\\config.properties");
		property.load(input);
		} catch (IOException ex) {
			ex.getMessage();
		}
			// System.out.println(property.getProperty("current.factory"));
		return property.getProperty("current.factory");
	}
}
