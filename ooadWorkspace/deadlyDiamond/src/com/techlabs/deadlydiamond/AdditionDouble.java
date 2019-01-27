package com.techlabs.deadlydiamond;

public class AdditionDouble implements Addition,Double {

	@Override
	public int add(int a, int b) {
		return a + b;
	}

	@Override
	public int add(int a) {
		return a * 2;
	}

}
