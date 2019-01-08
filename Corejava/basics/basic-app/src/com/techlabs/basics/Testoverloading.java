package com.techlabs.basics;

import java.util.Arrays;

public class Testoverloading {
	public static void main(String[] args){
		System.out.println(false);
		System.out.println(0);
		System.out.println(9.9);
		System.out.println("aja");
		System.out.println(0);
		
		printThis("HelloWorld");
		
		printThis(10);
		
		printThis(10.5);
		
		printThis(10.555f);
		
		printThis(true);
		
		printThis('a');
		
		int[] array = {10,20,30,40};
		
		
		printThis(array);
		
		
		
		
		
		
		
		
		
	}
		
		private static void printThis(String s ){
			
			System.out.println(s);
			
		}
		private static void printThis(int a){
			System.out.println(a);
			System.out.println("this is interger overloading");
		}
		
		private static void printThis(double a){
			System.out.println(a);
			System.out.println("this is double overloading");
			
		}
		private static void printThis(float a){
			System.out.println(a);
			System.out.println("this is float overloading");
		}
		private static void printThis(boolean b) {
			System.out.println(b);
			System.out.println("this is boolean overloading");
			
		}
		private static void printThis(char d){
			System.out.println(d);
			System.out.println("this is character overloading");
		}
		private static void printThis(int[] arr){
			System.out.println(Arrays.toString(arr));
			System.out.println("this is array overloading");
		}
		
		
	
	
}