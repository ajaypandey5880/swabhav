package com.techlabs.mantest;

import javax.management.ImmutableDescriptor;

import com.techlabs.man.Boy;
import com.techlabs.man.IEmotional;
import com.techlabs.man.IMannerable;
import com.techlabs.man.Man;

public class TestMannerableEmotional {

	public static void main(String[] args) {
		Man man = new Man();
		Boy boy = new Boy();
		atTheParty(man);
		atTheParty(boy);
		atTheMovie(boy);
		//atTheMovie(man);
		
	}
	
	public static void atTheParty(IMannerable manner) {
		System.out.println("At The Party");
		manner.wish();
		manner.depart();
	}
	
	public static void atTheMovie(IEmotional emotion) {
		System.out.println("At The Movie");
		emotion.cry();
		emotion.laugh();
	}
}	
