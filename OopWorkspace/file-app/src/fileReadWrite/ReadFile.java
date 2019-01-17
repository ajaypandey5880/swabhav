package fileReadWrite;

import java.io.BufferedReader;
import java.io.*;

public class ReadFile  {
	
	public static void main(String[] args)throws IOException{
		File file = new File("D:\\programs\\test.txt");
		BufferedReader br = new BufferedReader(new FileReader(file));
		String st;
		while((st = br.readLine())!= null)
			System.out.println(st);
		br.close();
	}
}