package com.techlabs.composite;

import java.util.ArrayList;
import java.util.List;

public class Folder implements IDiskItem {
	private String name;
	private List<IDiskItem> items = new ArrayList<IDiskItem>();

	public Folder(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public void display() {
		System.out.println("Name of Folder:" + this.getName() + "\t");
		for (IDiskItem item : items) {
			item.display();
		}
	}

	public void addItem(IDiskItem item) {
		items.add(item);
	}

}
