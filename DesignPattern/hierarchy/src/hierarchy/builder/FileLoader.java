package hierarchy.builder;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class FileLoader  {
	ArrayList<String> list = new ArrayList<String>();
	
	public ArrayList<String> readFile() throws IOException {
		FileInputStream stream = new FileInputStream("D:\\programs\\datafile.txt");
		BufferedReader reader = new BufferedReader(new InputStreamReader(stream));
		String string;
		while((string=reader.readLine()) != null) {
			list.add(string);
		}
		reader.close();
		return list;
		
	}
}
