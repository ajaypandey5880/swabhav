package com.techlabs.adapter;

import java.util.Iterator;
import java.util.LinkedList;

public class QueueAdapter<T> implements Iterable<T>{
	private LinkedList<T> list = new LinkedList<T>();
	
	public void nQueue(T no) {
		list.add(no);
	}

	public int count() {
		return list.size();
	}

	public T dQueue() {
		return list.remove();
	}

	@Override
	public Iterator<T> iterator() {
		return list.iterator();
	}
	
	
}
