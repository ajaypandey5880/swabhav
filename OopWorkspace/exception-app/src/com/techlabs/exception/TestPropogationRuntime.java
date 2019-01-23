package com.techlabs.exception;

public class TestPropogationRuntime {

	public static void main(String[] args) {
		try {
			f1();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		System.out.println("end of main");

	}

	public static void f1() {
		System.out.println("inside f1");
		f2();
	}

	public static void f2() {
		System.out.println("inside f2");
		f3();
	}

	public static void f3() {
		System.out.println("inside f3");
		throw new RuntimeException("f3 error");
	}
}
