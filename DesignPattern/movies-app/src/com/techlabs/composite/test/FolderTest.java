package com.techlabs.composite.test;

import com.techlabs.composite.File;
import com.techlabs.composite.Folder;

public class FolderTest {

	public static void main(String[] args) {

		File abc = new File("abc", ".avi", 50.2f);
		File xyz = new File("xyz", ".avi", 40f);
		File lmn = new File("lmn", ".avi", 48.6f);
		File pqr = new File("pqr", ".avi", 22.2f);

		Folder movie = new Folder("Movies");
		Folder Comedy = new Folder("Comedy Movies");
		Folder Bollywood = new Folder("Bollywood Movies");
		Folder Hollywood = new Folder("Hollywood Movies");

		movie.addItem(abc);
		movie.addItem(Bollywood);
		Bollywood.addItem(lmn);
		Bollywood.addItem(Comedy);
		Comedy.addItem(xyz);
		Hollywood.addItem(pqr);
		movie.addItem(Hollywood);
		movie.display();

	}
}
