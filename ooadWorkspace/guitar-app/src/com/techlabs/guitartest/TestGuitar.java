package com.techlabs.guitartest;

import com.techlabs.guitar.Builder;
import com.techlabs.guitar.GuitarSpecs;
import com.techlabs.guitar.Inventory;
import com.techlabs.guitar.Type;
import com.techlabs.guitar.Wood;

public class TestGuitar {

	public static void main(String[] args) {
		Inventory inventory = new Inventory();
		inventory.addGuitar("123",5000, Builder.FENDER, "vipul", Type.ACOUSTIC, Wood.ALDER, Wood.BRAZILLIAN_ROSEWOOD);
		inventory.addGuitar("124",5000, Builder.FENDER, "vipul", Type.ACOUSTIC, Wood.ALDER, Wood.BRAZILLIAN_ROSEWOOD);
		inventory.addGuitar("125",5000, Builder.FENDER, "vipul", Type.ACOUSTIC, Wood.ALDER, Wood.BRAZILLIAN_ROSEWOOD);
		GuitarSpecs specs = new GuitarSpecs(Builder.FENDER, "vipul", Type.ACOUSTIC, Wood.ALDER, Wood.ALDER);
		System.out.println(inventory.getGuitar("123"));
		System.out.println(inventory.search(specs));
		
	}

}
