package bookmark.test;

import java.io.IOException;
import java.util.*;

import bookmark.BookMarkDisplay;
import bookmark.Bookmark;
import bookmark.service.BookmarkService;

public class BookmarkConsole {

	public static void main(String[] args) throws IOException {
		Bookmark bookmark = new Bookmark();
		BookmarkService bookmarkService = new BookmarkService();
		BookMarkDisplay bookMarkDisplay = new BookMarkDisplay();
		int choice;
		final int ADD =0;
		final int DISPLAY = 1;
		final int EXIT = 2;
		Scanner scanner = new Scanner(System.in);
		
		do {
		System.out.println("Enter 0 to add BookMarks\n 1 to display the Bookmarks\n2 to exit");
		choice = scanner.nextInt();
		switch (choice){
		case ADD:
			System.out.println("enter the name");
			String name = scanner.nextLine();
			System.out.println("enter the URL");
			String url = scanner.nextLine();

			bookmark.setName(name);
			bookmark.setUrl(url);

			bookmarkService.add(bookmark.getUrl(), bookmark.getName());
			break;
		case DISPLAY:
			bookMarkDisplay.display();
			break;
		case EXIT:
			System.out.println("Thankyou for Using Boomark App");
			break;
		default:
			System.out.println("enter valid options");
		}
		}while( choice != 2);
		// String option = sc.nextLine();
		// b.setOption(InputOption.valueOf(option));
		// if (b.getOption().equals(InputOption.ADD)){
		// if(b.getOption().equals(InputOption.DISPLAY)) {
		
	}

}
