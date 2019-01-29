package com.techlabs.data.analyzer;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class DiskLoader implements ILoader {
	private String path;
	ArrayList<String> list = new ArrayList<String>();
	
	public DiskLoader(String path) {
		this.path = path;
	}

	@Override
	public ArrayList<String> load() throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
		String line;
		while ((line = bufferedReader.readLine()) != null) {
			list.add(line);
		}
		bufferedReader.close();
		return list;

	}

}
