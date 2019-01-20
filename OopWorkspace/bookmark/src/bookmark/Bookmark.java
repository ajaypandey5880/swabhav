package bookmark;

import java.io.*;

import bookmark.test.InputOption;

public class Bookmark {

	private String url = "";
	private String name = "";
	private InputOption option;

	public InputOption getOption() {
		return option;	
	}

	public void setOption(InputOption option) {
		this.option = option;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
