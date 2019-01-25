package com.techlabs.instrument;

public class Instrument {
	private String serialNumber;
	private double price;
	private InstrumentSpecs spec;

	public Instrument(String serialNumber, double price, InstrumentSpecs spec) {
		this.serialNumber = serialNumber;
		this.price = price;
		this.spec = spec;
	}

	public String getSerialNumber() {
		return serialNumber;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(float newPrice) {
		this.price = newPrice;
	}

	public InstrumentSpecs getSpec() {
		return spec;
	}
}
