package com.techlabs.array;

public class TestIntergerArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no = 10;
		changeToZero (no);
		System.out.println(no);
		int[] nos = {10,20,30};
		changeToZero (nos);
		for( int number : nos) {
			System.out.println(number);
		}
	}
	static void changeToZero (int no){
		no = 0;
		//System.out.println(no.);
	}
	static void changeToZero (int[] no) {
		for(int i=0; i< no.length ;i++) {
			//System.out.println(no[i]);
			no[i]=0;
		}
	}
}
