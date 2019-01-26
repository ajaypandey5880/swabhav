package csvread;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class CsvRead {
	static Map<String, String> state;
	static Map<String , String> capital;

	public static void main(String[] args) throws IOException {
		String filepath = "D:\\swabhav-repos\\swabhav\\OopWorkspace\\csv-app\\src\\data\\State.csv";

		csvFileReader(filepath);
		System.out.println(state);
		capital = new TreeMap<String, String>((Map<? extends String, ? extends String>) new ValueComparator());
	}

	public static void csvFileReader(String filepath) throws IOException {
		File file = new File(filepath);
		BufferedReader br = new BufferedReader(new FileReader(file));
		state = new TreeMap<String, String>();
		String st;
		while ((st = br.readLine()) != null) {
			st = st.toLowerCase();
			String[] name = st.split(",");
			addToTreeMap(name);
		}
		br.close();

	}

	public static void addToTreeMap(String[] names) {
		for (int i = 0; i < names.length; i++) {
			state.put(names[0].trim(), names[1].trim());
		}
	}

}
