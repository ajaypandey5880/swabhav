package com.techlabs.data.analyzer.test;

import java.io.IOException;

import com.techlabs.data.analyzer.ILoader;
import com.techlabs.data.analyzer.UrlLoader;

public class UrlLoaderTest  {

	public static void main(String[] args) throws IOException, IOException {
		 ILoader iLoader = new UrlLoader("https://swabhav-tech.firebaseapp.com/emp.txt ");
		System.out.println(iLoader.load());
		 
		
	}

}
