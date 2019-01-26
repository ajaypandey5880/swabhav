package com.techlabs.guitar;

public enum Builder {
	FENDER, MARTIN, GIBSON, COLLINGS, ALSON, RYAN, PRS, ANY;
	public String toString() {
		switch (this) {
		case FENDER:
			return "fender";
		case MARTIN:
			return "Martin";
		case GIBSON:
			return "Gibson";
		case COLLINGS:
			return "Collings";
		case ALSON:
			return "Alson";
		case RYAN:
			return "Ryan";
		case PRS:
			return "PRS";
		case ANY:
			return "Any";
		default:
			return null;

		}

	}
}
