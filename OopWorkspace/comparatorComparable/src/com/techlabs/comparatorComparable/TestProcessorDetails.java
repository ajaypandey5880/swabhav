package com.techlabs.comparatorComparable;

public class TestProcessorDetails {

	public static void main(String[] args) {
		ProcessorDetails processor = new ProcessorDetails("i5", 5000);
		ProcessorDetails processor1 = new ProcessorDetails("i7", 15000);
		ProcessorDetails processor2 = new ProcessorDetails("i3", 3000);
		Processor pro = new Processor();
		if (processor.compareTo(processor2)==0) {
			System.out.println(processor.getprocessorNo()+"is costly");
		}
		if (pro.compare(processor,processor1)==0) {
			System.out.println(processor);
		}
	}

}
