package com.techlabs.singleton;

public class DataService {
	private static final DataService INSTANCE = new DataService();

	private DataService() {
		System.out.println("Service Created");
	}

	public void doSomething() {
		System.out.println("Doing something by" + hashCode());
	}

	public static DataService getInstance() {
		return INSTANCE;
	}
}
