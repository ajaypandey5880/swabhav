package com.techlabs.basics;

public class StringSubString {
	public static void main(String[] args) throws Exception{
		String Url =  "https://www.swabhavtechlabs.com?developer=ajay&client=aurionpro";
		char[] Url_array = Url.toCharArray();
		for(int i=0;i<=Url_array.length;i++) {
			if(Url_array[i]=='w') {
				if(Url_array[i+1]=='w') {
					if(Url_array[i+2]=='w') {
						int start = i+3;
						System.out.println(start);
						
					}
				}
			}
			if(Url_array[i]=='.') {
				if(Url_array[i+1]=='c'){
					if(Url_array[i+2]=='o') {
						int end = i;
						System.out.println(end);
					}
				}
			}
		}
		String domain = Url.substring(start , end);
		System.out.println(domain);
		
		
		
	}

}
