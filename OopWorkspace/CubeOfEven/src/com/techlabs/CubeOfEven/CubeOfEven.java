package com.techlabs.CubeOfEven;

public class CubeOfEven {
	
	public int evenCube(int no) {
		if (no%2!=0) {
			throw new RuntimeException("Pass A Even No");
		}
		return no*no*no;
	}
}
