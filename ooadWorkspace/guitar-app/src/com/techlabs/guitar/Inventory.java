package com.techlabs.guitar;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Inventory {
	private List<Guitar> guitars;

	public Inventory() {
		guitars = new ArrayList<Guitar>();
	}

	public void addGuitar(String serialNumber, double price, Builder builder, String model, Type type, Wood backwood,
			Wood topwood) {
		Guitar guitar = new Guitar(serialNumber, price, builder, model, type, backwood, topwood);
		guitars.add(guitar);
	}

	public Guitar getGuitar(String serialNumber) {
		for (Iterator<Guitar> i = (Iterator<Guitar>) guitars.iterator(); i.hasNext();) {
			Guitar guitar = (Guitar) i.next();
			if (guitar.getSerailNo().equals(serialNumber)) {
				return guitar;
			}
		}
		return null;
	}

	public List<Guitar> search(GuitarSpecs searchSpec) {
		List<Guitar> matchingGuitars = new ArrayList<Guitar>();
		for (Guitar guitar : guitars) {
			if (guitar.getGuiterSpecs().matches(searchSpec)) {
				matchingGuitars.add(guitar);
			}
		}
		return matchingGuitars;
	}

}
