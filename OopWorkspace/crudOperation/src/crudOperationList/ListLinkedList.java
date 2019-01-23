package crudOperationList;

import java.util.Iterator;
import java.util.LinkedList;

public class ListLinkedList {

	public static void main(String[] args) {
		LinkedList<Integer> noList = new LinkedList<Integer>();
		noList.add(10); // create
		noList.add(20);
		noList.add(30);
		System.out.println(noList+"\nAfter updating");
		noList.set(1, 30); //update
		System.out.println(noList);//read
		noList.remove(2);//delete
		System.out.println("after Deleting\n"+noList);
		noList.addFirst(20); // not in Arraylist
		noList.offer(30); // not in Arraylist
		System.out.println(noList);
	}

}
