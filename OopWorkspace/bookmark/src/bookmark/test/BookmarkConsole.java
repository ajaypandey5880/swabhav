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
		// System.out.println("select the operation you want to perform add or
		// display");
		System.out.println("Enter 0 to add BookMarks\n 1 to display the Bookmarks");
		int choice = sc.nextInt();
		// String option = sc.nextLine();
		// b.setOption(InputOption.valueOf(option));
		if (choice != 0 && choice != 1) {
			System.out.println("Choose valid Option");

		}

		// if (b.getOption().equals(InputOption.ADD)){
		if (choice == 0) {
			System.out.println("enter the name");
			String name = sc.nextLine();
			System.out.println("enter the URL");
			String url = sc.nextLine();

			b.setName(name);
			b.setUrl(url);

			b1.add(b.getUrl(), b.getName());
		}
		// if(b.getOption().equals(InputOption.DISPLAY)) {
		if (choice == 1) {
			b1.display();
		}
	}

}
