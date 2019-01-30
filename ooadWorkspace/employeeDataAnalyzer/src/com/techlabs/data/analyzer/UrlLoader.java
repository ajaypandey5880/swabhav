package com.techlabs.data.analyzer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;

public class UrlLoader implements ILoader {
	private String path;
	ArrayList<String> list = new ArrayList<String>();

	public UrlLoader(String path) {
		this.path = path;
	}

	@Override
	public ArrayList<String> load() throws IOException {
		URL url = new URL(path);
		URLConnection urlConnection = url.openConnection();
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
		String line;

		while ((line = bufferedReader.readLine()) != null) {
			list.add(line);
		}
		bufferedReader.close();

		return list;

	}

}
