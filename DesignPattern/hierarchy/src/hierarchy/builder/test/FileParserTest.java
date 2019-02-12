package hierarchy.builder.test;

import java.io.IOException;

import hierarchy.builder.FileLoader;
import hierarchy.builder.FileParser;

public class FileParserTest {

	public static void main(String[] args) throws NumberFormatException, IOException {
		FileLoader fileLoader = new FileLoader();
		FileParser parser = new FileParser();
		parser.parse(fileLoader);
		System.out.println(parser.parse(fileLoader));
	}

}
