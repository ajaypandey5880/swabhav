package com.techlabs.composite;

public class File implements IDiskItem {
	private String name;
	private String extension;
	private float size;

	public File(String name, String extension, float size) {
		this.name = name;
		this.extension = extension;
		this.size = size;
	}

	@Override
	public void display() {
		System.out.println("\tName of File :" + this.getName() + "(" + this.getSize() + ")");
	}

	public String getName() {
		return name;
	}

	public String getExtension() {
		return extension;
	}

	public float getSize() {
		return size;
	}

}
