package fileReadWrite;
import java.io.*;
public class WriteFile {

	public static void main(String[] args) throws IOException {
		
		FileWriter fw = new FileWriter("D:\\programs\\test.txt",false);
		fw.write("text changed");
		fw.close();
	}

}
