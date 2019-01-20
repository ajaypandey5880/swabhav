package bookmark.test;

import java.io.IOException;
import java.util.*;

import bookmark.Bookmark;
import bookmark.service.BookmarkService;

public class BookmarkConsole {

	public static void main(String[] args) throws IOException {
		Bookmark b = new Bookmark();
		BookmarkService b1 = new BookmarkService();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the name");
		String name = sc.nextLine();
		System.out.println("enter the URL");
		String url = sc.nextLine();
		
		b.setName(name);
		b.setUrl(url);
		
		b1.add(b.getUrl(),b.getName());
		b1.display();
	}

}
