package com.tachlabs.man.test;

import com.tachlabs.man.Boy;
import com.tachlabs.man.Infant;
import com.tachlabs.man.Kid;
import com.tachlabs.man.Man;

public class TestMan {

	public static void main(String[] args) {
		System.out.println("Output of Case1");
		case1();
		System.out.println("Output of Case2");
		case2();
		System.out.println("Output of Case3");
		case3();
		System.out.println("Output of Case4");
		case4();
	}

	public static void case1() {
		Man x;
		x = new Man();
		x.read();
		x.eat();
		x.play();
	}
	
	public static void case2() {
		Boy y;
		y = new Boy();
		y.read();
		y.eat();
		y.play();
		y.walk();
	}
	
	public static void case3() {
		Man x;
		x = new Boy();
		x.play();
		x.read();
		x.eat();
	}
	
	public static void case4() {
		atThePark(new Man());
		atThePark(new Boy());
		atThePark(new Kid());
		atThePark(new Infant());
	}
	public static void atThePark(Man x) {
		System.out.println("At The Park");
		x.play();
	}
}
