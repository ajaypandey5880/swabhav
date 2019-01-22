package com.techlabs.comparatorComparable;

import java.util.Comparator;

public class Processor implements Comparator<ProcessorDetails> {

	@Override
	public int compare(ProcessorDetails p1, ProcessorDetails p2) {
		if (p1.getprocessorPrice() < p2.getprocessorPrice()) {
			return 0;
		}
		if (p1.getprocessorPrice() > p2.getprocessorPrice()) {
			return 1;
		}
		return -1;
	}

}
