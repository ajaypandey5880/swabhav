package com.techlabs.demo;
public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<99;i++) {
			//if(i%2 == 0) {
			//	System.out.printf("Even no are %d",i);
			//}
			check(i);
		}
	}
	static void check(int no) {
		if(no%2==0) {
			System.out.printf("%.d is a Even no",no);
			
		}
		else {
			System.out.printf("%.d is a odd no");
		}
			
		
	}
	}

