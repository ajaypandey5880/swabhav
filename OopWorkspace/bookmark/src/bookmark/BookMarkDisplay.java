package bookmark;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

public class BookMarkDisplay {

	Desktop desktop = Desktop.getDesktop();

	public void display() throws IOException {
		File file = new File("D:\\swabhav-repos\\swabhav\\OopWorkspace\\bookmark\\Bookmarks.html");
		if (file.exists())
			desktop.open(file);
	}
}
