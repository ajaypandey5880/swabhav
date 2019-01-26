package com.techlabs.guitar;

public class Guitar {
	private String serailNo;
	private double price;
	private GuitarSpecs specs;

	public Guitar(String serialNo,double price,Builder builder,String model,Type type,Wood backwood,Wood 
			topwood) {
		this.serailNo = serialNo;
		this.price = price;
		this.specs = new GuitarSpecs(builder, model, type, backwood, topwood);
	}
	
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getSerailNo() {
		return serailNo;
	}

	public GuitarSpecs getGuiterSpecs() {
		return specs;
	}
}
