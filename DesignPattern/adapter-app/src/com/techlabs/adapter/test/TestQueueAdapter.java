package com.techlabs.adapter.test;

import com.techlabs.adapter.QueueAdapter;

public class TestQueueAdapter {

	public static void main(String[] args) {
		QueueAdapter<Integer> adapter = new QueueAdapter<Integer>();
		adapter.nQueue(10);
		adapter.nQueue(20);
		adapter.nQueue(30);
		adapter.nQueue(40);
		System.out.println("Removing "+adapter.dQueue());
		System.out.println("Removing "+adapter.dQueue());
		System.out.println("count "+adapter.count());
		QueueAdapter<String> adapter1 = new QueueAdapter<String>();
		adapter1.nQueue("ajay");
		adapter1.nQueue("gaurang");
		adapter1.nQueue("prachit");
		adapter1.nQueue("vinod");
		System.out.println("Removing "+adapter1.dQueue());
		System.out.println("Removing "+adapter1.dQueue());
		System.out.println(adapter1.count());
		for(Integer integer : adapter) {
			System.out.println(integer);
		}
	}

}
