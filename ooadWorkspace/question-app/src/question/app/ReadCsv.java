package question.app;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadCsv {
	private QuestionBank questionBank = new QuestionBank();

	public void readCsv() throws IOException {
		String filename = "";
		File file = new File(filename);
		BufferedReader reader = new BufferedReader(new FileReader(file));
		String st;
		while ((st = reader.readLine()) != null) {
			st = st.toLowerCase();
			String[] data = st.split(",");
			questionBank.addQuestion(new Question(data[0], data[1], data[2], data[3], data[4], data[5]));
		}
		reader.close();
	}
}
