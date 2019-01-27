package dip.test;

import dip.voilation.LogType;
import dip.voilation.TaxCalculator;

public class DipVoilationTest {

	public static void main(String[] args) {
		TaxCalculator taxCalculator = new TaxCalculator(LogType.DB);
		TaxCalculator taxCalculator2 = new TaxCalculator(LogType.XML);
		taxCalculator.calculateTax(0, 0);
		taxCalculator2.calculateTax(100, 10);
	}

}
