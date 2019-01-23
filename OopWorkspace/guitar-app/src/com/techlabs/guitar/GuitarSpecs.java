package com.techlabs.guitar;

public class GuitarSpecs {
	private Builder builder;
	private Type type;
	private Wood backwood;
	private Wood topwood;
	private String model;
	
	public GuitarSpecs(Builder builder,String model,Type type,Wood backWood,Wood topWood) {
		this.builder = builder;
		this.model = model;
		this.type = type;
		this.backwood = backWood;
		this.topwood = topWood;
	}
	
	public Builder getBuilder() {
		return builder;
	}

	public Type getType() {
		return type;
	}

	public Wood getBackwood() {
		return backwood;
	}

	public Wood getTopwood() {
		return topwood;
	}

	public String getModel() {
		return model;
	}
	
	public boolean matches(GuitarSpecs otherSpec) {
	    if (builder != otherSpec.builder)
	      return false;
	    if ((model != null) && (!model.equals("")) &&
	        (!model.toLowerCase().equals(otherSpec.model.toLowerCase())))
	      return false;
	    if (type != otherSpec.type)
	      return false;
	    if (backwood != otherSpec.backwood)
	      return false;
	    if (topwood != otherSpec.topwood)
	      return false;
	    return true;
	  }
}
