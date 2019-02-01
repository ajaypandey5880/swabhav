package com.techlabs.prolinklist;

public class ProLinkedLIst<T> {
	private Node<T> head;
	private int listCount;

	public ProLinkedLIst(T t) {
		head = new Node<T>(t);
		listCount = 0;
	}

	public void print() {
		Node<T> current = head;
		while (current.getNext() != null) {
			System.out.println(current.getData());
			current = current.getNext();
		}
		System.out.println(current.getData());
	}
	
	public void deleteNodeWithElement(T d) {
		Node<T> current = head;
		while (current.getNext() != null) {
			if (current.getNext().getData() == d) {
				current.setNext(current.getNext().getNext());
				listCount--;
			}
			current = current.getNext();
		}
		//throw new RuntimeException("No such Data");
	}
	
	public void delete() {
		Node<T> current = head;
		while(current.getNext() != null) {
			current.setNext(current.getNext().getNext());
			listCount--;
			current = current.getNext();
		}
	}

	public void add(T d) {
		Node<T> end = new Node<T>(d);
		Node<T> current = head;

		while (current.getNext() != null) {
			current = current.getNext();
		}
		current.setNext(end);
		listCount++;
	}

}
