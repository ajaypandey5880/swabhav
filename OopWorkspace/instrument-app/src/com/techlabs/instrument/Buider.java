package com.techlabs.instrument;

public enum Buider {
	FENDER, MARTIN, GIBSON;

	public String toString() {
		switch (this) {
		case FENDER:
			return "Fender";
		case MARTIN:
			return "Martin";
		case GIBSON:
			return "Gibson";
		default:
			return "null";
		}
	}
}
