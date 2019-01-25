package csvread.test;

import java.io.IOException;
import csvread.CsvRead;

public class TestCsv {

	public static void main(String[] args) throws IOException {
		CsvRead csv = new CsvRead();
		csv.add("gujrat", "surat");
		csv.add("goa", "panjim");
		csv.add("maharashtra", "mumbai");
		csv.add("Maharashtra","mumbai");
		//csv.generate(stateMap);
	}

}
