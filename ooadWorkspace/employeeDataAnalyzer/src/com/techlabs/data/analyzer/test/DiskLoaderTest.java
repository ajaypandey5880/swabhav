package com.techlabs.data.analyzer.test;

import java.io.IOException;
import java.net.MalformedURLException;

import com.techlabs.data.analyzer.DiskLoader;
import com.techlabs.data.analyzer.ILoader;

public class DiskLoaderTest {

	public static void main(String[] args) throws MalformedURLException, IOException {
		ILoader iLoader = new DiskLoader("D:\\programs\\dataFile.txt");
		
		System.out.println(iLoader.load());
	}

}
