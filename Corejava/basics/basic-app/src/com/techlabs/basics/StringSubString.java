package com.techlabs.basics;

public class StringSubString {
	public static void main(String[] args) throws Exception{
		String Url =  "https://www.swabhavtechlabs.com?developer=ajay&client=aurionpro";
		char[] Url_array = Url.toCharArray();
		//System.out.println(Url_array[0]);
		char[] pointer = {'w','w','w'} ;
		for(char c : Url_array) {
		
			
			if(c==pointer[0]) {
				if(c+1==pointer[1]) {
					if(c+2==pointer[2]) {
						int start = c+3;
						System.out.println(start);
					}
				}
			}
			
		}
		
		
	}

}
