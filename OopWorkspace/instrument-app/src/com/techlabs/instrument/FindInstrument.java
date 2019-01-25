package com.techlabs.instrument;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class FindInstrument {
	public static void main(String[] args) {

		Inventory inventory = new Inventory();
		initializeInventory(inventory);

		Map properties = new HashMap();
		properties.put("builder", Buider.GIBSON);
		properties.put("backWood", Wood.MAPLE);
		InstrumentSpecs whatBryanLikes = new InstrumentSpecs(properties);

		List matchingInstruments = inventory.search(whatBryanLikes);
		if (!matchingInstruments.isEmpty()) {
			System.out.println("Bryan, you might like these instruments:");
			for (Iterator i = matchingInstruments.iterator(); i.hasNext();) {
				Instrument instrument = (Instrument) i.next();
				InstrumentSpecs spec = instrument.getSpec();
				System.out
						.println("We have a " + spec.getProperty("instrumentType") + " with the following properties:");
				for (Iterator j = spec.getProperties().keySet().iterator(); j.hasNext();) {
					String propertyName = (String) j.next();
					if (propertyName.equals("instrumentType"))
						continue;
					System.out.println("    " + propertyName + ": " + spec.getProperty(propertyName));
				}
				System.out.println("  You can have this " + spec.getProperty("instrumentType") + " for $"
						+ instrument.getPrice() + "\n---");
			}
		} else {
			System.out.println("Sorry, Bryan, we have nothing for you.");
		}
	}

	private static void initializeInventory(Inventory inventory) {
		Map properties = new HashMap();

		properties.put("builder", Buider.GIBSON);
		properties.put("model", "Les Paul");
		properties.put("topWood", Wood.MAPLE);
		properties.put("backWood", Wood.MAPLE);
		inventory.addInstrument("70108276", 2295.95, new InstrumentSpecs(properties));

		properties.put("instrumentType", InstrumentType.BANJO);
		properties.put("model", "RB-3 Wreath");
		properties.remove("topWood");
		properties.put("numStrings", 5);
		inventory.addInstrument("8900231", 2945.95, new InstrumentSpecs(properties));
	}
}
