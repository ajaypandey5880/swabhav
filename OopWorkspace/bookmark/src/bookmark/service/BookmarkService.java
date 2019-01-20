package bookmark.service;

import java.io.FileWriter;
import java.io.IOException;

import bookmark.Bookmark;

public class BookmarkService {
	
	
	public void add(String url,String name) throws IOException {

		FileWriter fr = new FileWriter("Bookmarks.html",true);
		fr.append("<a href =http://"+url+">"+name+"</a><br>");
		fr.close();
		
	}
	public void display() {
		System.out.println("your file has been exported in path D:\\swabhav-repos\\swabhav\\OopWorkspace\\bookmark ");
	}
}
