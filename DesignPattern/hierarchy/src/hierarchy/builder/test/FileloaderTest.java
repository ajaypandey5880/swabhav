package hierarchy.builder.test;

import java.io.IOException;

import hierarchy.builder.FileLoader;

public class FileloaderTest {

	public static void main(String[] args) throws IOException {
		FileLoader loader = new FileLoader();
		loader.readFile();
		System.out.println(loader.readFile());
	}

	
}
