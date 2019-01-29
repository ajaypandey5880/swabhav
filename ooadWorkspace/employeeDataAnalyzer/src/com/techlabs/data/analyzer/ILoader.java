package com.techlabs.data.analyzer;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.ArrayList;

public interface ILoader {
	public ArrayList<String> load() throws MalformedURLException, IOException;
}
