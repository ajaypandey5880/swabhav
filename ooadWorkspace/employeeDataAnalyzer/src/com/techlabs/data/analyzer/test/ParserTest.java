package com.techlabs.data.analyzer.test;

import java.io.IOException;

import com.techlabs.data.analyzer.Parser;
import com.techlabs.data.analyzer.UrlLoader;

public class ParserTest {

	public static void main(String[] args) throws IOException {
		Parser parser = new Parser();
		// parser.parse(new DiskLoader("D:\\\\programs\\\\dataFile.txt"));
		System.out.println(parser.parse(new UrlLoader("https://swabhav-tech.firebaseapp.com/emp.txt ")).size());

	}

}
