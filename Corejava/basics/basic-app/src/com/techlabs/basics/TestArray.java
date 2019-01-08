package com.techlabs.basics;

import java.util.Arrays;


public class TestArray {
	
	public static void main(String[] args){
		
		//int[] arr = [10,20,30,40]
		int[] arr = new int[10];
		arr[0]=5;
		arr[1]=6;
		//arr[2]=9;
		
		System.out.println(Arrays.toString(arr));
				
		for(int i=arr.length-1 ; i>0; i--)
	       {
	           arr[i] = arr[i-1];
	       }
		   
	    arr[0] = 10;
	    System.out.println(Arrays.toString(arr));
		arr[0]=50;
		System.out.println(Arrays.toString(arr));
		
		
	}

}
