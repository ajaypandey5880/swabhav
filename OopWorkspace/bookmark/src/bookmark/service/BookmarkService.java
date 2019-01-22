package bookmark.service;

import java.awt.Desktop;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;

import bookmark.Bookmark;

public class BookmarkService {

	Desktop desktop = Desktop.getDesktop();

	public void add(String url, String name) throws IOException {

		FileWriter fr = new FileWriter("Bookmarks.html", true);
		fr.append("<a href =http://" + url + ">" + name + "</a><br>");
		fr.close();

	}

	public void display() throws IOException {
			File file = new File("data\\Bookmarks.html");
		if (file.exists())
			desktop.open(file);
		// Files.createLink(file,"D:\\swabhav-repos\\swabhav\\OopWorkspace\\bookmark");
		// System.out.println("your file has been exported in path
		// D:\\swabhav-repos\\swabhav\\OopWorkspace\\bookmark");
	}
}
