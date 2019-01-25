package csvread;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class CsvRead {

	Map<String, String> stateMap = new TreeMap<String, String>();
	private String filepath = "D:\\swabhav-repos\\swabhav\\OopWorkspace\\csv-app\\src\\data\\State.csv";
	private String splitBy = ",";

	public void generate() throws IOException {
		
		FileWriter file = new FileWriter(filepath, true);
		for (Map.Entry<String, String> entry : stateMap.entrySet()) {
			if (entry.getKey().startsWith(" ") || entry.getKey().endsWith(" ")) {
				file.append(entry.getKey());
				file.append(splitBy);
				file.append(entry.getValue());
				file.append("\n");
				file.close();
			}
		}
	}

	public void add(String state, String capital) {
		stateMap.put(state, capital);
		System.out.println(stateMap);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((stateMap == null) ? 0 : stateMap.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CsvRead other = (CsvRead) obj;
		if (stateMap == null) {
			if (other.stateMap != null)
				return false;
		} else if (!stateMap.equals(other.stateMap))
			return false;
		return true;
	}
}
