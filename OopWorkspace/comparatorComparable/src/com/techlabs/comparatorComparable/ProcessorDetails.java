package com.techlabs.comparatorComparable;

import javax.annotation.processing.Processor;

public class ProcessorDetails implements Comparable<ProcessorDetails> {
	private String processorNo;
	private double processorPrice;

	public ProcessorDetails(String ProcessorNo, double ProcessorPrice) {
		this.processorNo = ProcessorNo;
		this.processorPrice = ProcessorPrice;
	}
	
	public String getprocessorNo() {
		return processorNo;
	}
	public double getprocessorPrice() {
		return processorPrice;
	}

	@Override
	public int compareTo(ProcessorDetails processor) {
		if (this.processorPrice < processor.getprocessorPrice()) {
			return 0;
		}
		if (this.processorPrice > processor.getprocessorPrice()) {
			return 1;
		}
		return -1;
	}

}
