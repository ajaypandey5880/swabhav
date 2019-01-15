package com.techlabs.rectangle;

public class Rectangle {
	private int length;
	private int width;

	public int calculateArea() {
		int area = length * width;
		return area;
	}

	public int getlength() {
		return length;

	}

	public int getwidth() {
		return width;
	}

	public void setlength(int newLength) {
		checkBound(newLength);
		length = checkBound(newLength);
	}

	public void setwidth(int newWidth) {
		checkBound(newWidth);
		width = checkBound(newWidth);
	}

	public int checkBound(int no) {
		if (no <= 0) {
			return 1;
		}
		if (no > 100) {
			return 100;
		}
		return no;

	}

}
