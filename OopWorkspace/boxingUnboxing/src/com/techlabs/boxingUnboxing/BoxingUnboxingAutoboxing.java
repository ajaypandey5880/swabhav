package com.techlabs.boxingUnboxing;

import java.util.ArrayList;

public class BoxingUnboxingAutoboxing {

	public static void main(String[] args) {
		Integer integer = new Integer(10); // boxing 
		System.out.println(integer);
		int i = integer; // unboxing
		System.out.println(i);
		ArrayList<Integer> integerList = new ArrayList<Integer>();
		integerList.add(1);	//autoboxing
		integerList.add(5);	//autoboxing
		System.out.println(integerList);
		
		
		
	}

}
