package com.techlabs.basics;

public class UrlString {

	public static void main(String[] Url) throws Exception{
		// TODO Auto-generated method stub
		//String Url = "https://www.swabhavtechlabs.com?developer=ajay&client=aurionpro";
		String[] domain = Url[0].split("\\.");
		System.out.println("domain = "+ domain[1]);
		String[] client = domain[2].split("&");
		
		String[] developer = client[0].split("\\?");
		System.out.println(developer[1]);
		System.out.println(client[1]);
		
		

	}

}
