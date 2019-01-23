package crudOperationList;

import java.util.*;

public class ListArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> noList = new ArrayList<Integer>();
		noList.add(10); //create
		noList.add(20);
		noList.add(30);
		System.out.println(noList+"\nAfter Updating");
		noList.set(1, 30); //update
		System.out.println(noList); //read
		noList.remove(1);  //delete
		System.out.println("After deleting");
		System.out.println(noList);
		
	}

}
