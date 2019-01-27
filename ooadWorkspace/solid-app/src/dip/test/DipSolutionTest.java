package dip.test;

import dip.solution.DbLogger;
import dip.solution.TaxCalculator;
import dip.solution.XmlLogger;

public class DipSolutionTest {

	public static void main(String[] args) {
		TaxCalculator taxCalculator = new TaxCalculator( new DbLogger());
		TaxCalculator taxCalculator2 = new TaxCalculator(new XmlLogger());
		taxCalculator.calculateTax(0, 0);
		taxCalculator2.calculateTax(100, 10);
	}

}
