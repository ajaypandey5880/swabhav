package com.techlabs.rectangleTest;

import com.techlabs.rectangle.Rectangle;

public class TestRectangle {

	public static void main(String[] args) {
		Rectangle rect = new Rectangle();
		rect.setlength(105);
		rect.setwidth(-10);
		System.out.println("length is " + rect.getlength());
		System.out.println("width is " + rect.getwidth());
		System.out.println(+rect.calculateArea());
	}
}
