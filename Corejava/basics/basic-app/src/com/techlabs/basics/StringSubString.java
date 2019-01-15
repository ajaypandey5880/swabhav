package com.techlabs.basics;



public class StringSubString {
	public static void main(String[] url) throws Exception{
		//String u = new String("https://www.swabhavtechlabs.com?developer=ajay&client=aurionpro");
		int start = url[0].indexOf('.');
		int end = url[0].indexOf('.',12);
		printSubstring (url,start,end);
		start = url[0].indexOf('?');
		end = url[0].indexOf('&');
		printSubstring (url,start,end);
		printSubstring (url,end,url[0].length());
		
		
		
		}
		

	private static void printSubstring (String[] Url ,int start, int end) {
		// TODO Auto-generated method stub
		//String domain = Url[0].substring(start+1,end);
		System.out.println( Url[0].substring(start+1,end));
		
		
	}
	}
