package com.techlabs.iteratorIterable;


import java.util.*;

public class IterableDemo<T> implements Iterable<T> {
	private List name;
	public IterableDemo(ArrayList<String> nameList) {
		name = Arrays.asList(nameList);
	}
	public static void main(String[] args) {
		ArrayList<String> nameList = new ArrayList<String>();
		nameList.add("a");
		nameList.add("j");
		nameList.add("a");
		nameList.add("y");
		IterableDemo<String> list = new IterableDemo<String>(nameList);
		for(String i : list) {
			System.out.println(i);
		}
	}

	@Override
	public Iterator<T> iterator() {
		
		return name.iterator();
	}

}
