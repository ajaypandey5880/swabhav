package com.techlabs.exception;

public class TestPropogation {

	public static void main(String[] args) throws Exception {
		try {
			f1();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("end of main");

	}

	public static void f1() throws Exception {
		System.out.println("inside f1");
		f2();
	}

	public static void f2() throws Exception {
		System.out.println("inside f2");
		f3();
	}

	public static void f3() throws Exception {
		System.out.println("inside f3");
		throw new Exception("f3 error");
	}
}
