package fileReadWrite;

import java.io.*;

public class AppendFile {

	public static void main(String[] args) throws IOException {
		FileWriter fr = new FileWriter("D:\\programs\\test.txt",true);
		fr.append("text added");
		fr.close();
		
	}

}
