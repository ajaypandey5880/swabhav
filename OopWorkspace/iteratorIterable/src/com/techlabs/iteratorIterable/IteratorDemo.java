package com.techlabs.iteratorIterable;

import java.util.*;

public class IteratorDemo {

	public static void main(String[] args) {
		ArrayList<String> name = new ArrayList<String>();
		name.add("a");
		name.add("j");
		name.add("a");
		name.add("y");
		Iterator iterator = name.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
