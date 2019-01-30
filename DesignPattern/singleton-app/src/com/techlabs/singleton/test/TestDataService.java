package com.techlabs.singleton.test;

import com.techlabs.singleton.DataService;
import com.techlabs.singleton.DataServiceEnum;

public class TestDataService {

	public static void main(String[] args) {
		DataService service1 = DataService.getInstance();
		service1.doSomething();
		DataService service2 = DataService.getInstance();
		service2.doSomething();
		DataServiceEnum instance = DataServiceEnum.INSTANCE;//singleton
		DataServiceEnum instance1 = DataServiceEnum.INSTANCE;
		System.out.println(instance.hashCode());
		System.out.println(instance1.hashCode());
	}
}