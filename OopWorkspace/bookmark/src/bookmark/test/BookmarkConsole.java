package bookmark.test;

import java.io.IOException;
import java.util.*;

import bookmark.Bookmark;
import bookmark.service.BookmarkService;

public class BookmarkConsole {

	public static void main(String[] args) throws IOException {
		Bookmark b = new Bookmark();
		BookmarkService b1 = new BookmarkService();
		int choice;
		final int ADD =0;
		final int DISPLAY = 1;
		Scanner scanner = new Scanner(System.in);
		// System.out.println("select the operation you want to perform add or
		// display");
		do {
		System.out.println("Enter 0 to add BookMarks\n 1 to display the Bookmarks\n2 to exit");
		choice = scanner.nextInt();
		switch (choice){
		case ADD:
			System.out.println("enter the name");
			String name = scanner.nextLine();
			System.out.println("enter the URL");
			String url = scanner.nextLine();

			b.setName(name);
			b.setUrl(url);

			b1.add(b.getUrl(), b.getName());
			break;
		case DISPLAY:
			b1.display();
			break;
		default:
			System.out.println("enter valid options");
		}
		}while( choice != 3);
		// String option = sc.nextLine();
		// b.setOption(InputOption.valueOf(option));
		// if (b.getOption().equals(InputOption.ADD)){
		// if(b.getOption().equals(InputOption.DISPLAY)) {
		
	}

}
