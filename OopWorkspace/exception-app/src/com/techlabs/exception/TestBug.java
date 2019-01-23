package com.techlabs.exception;

public class TestBug {

	public static void main(String[] args) {
		try {
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			int c = a / b;
			System.out.println("value of c is" + c);
		} catch (NumberFormatException e) {
			System.out.println("pass a int value");
			System.out.println(e.getMessage());
		} catch (ArrayIndexOutOfBoundsException a) {
			System.out.println("pass some value to args");
			System.out.println(a.getMessage());
		} catch (ArithmeticException a) {
			System.out.println("value of denomnator cannot be 0");
			System.out.println(a.getMessage());
		}
		System.out.println("thankyou");

	}

}
