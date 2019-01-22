package com.tachlabs.man.test;

import com.tachlabs.constructor.Child;

public class TestParent {

	public static void main(String[] args) {
		Child child = new Child();
		System.out.println(child.getfoo());
		Child child1 = new Child(100);
		System.out.println(child1.getfoo());
	}
}
