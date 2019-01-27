package dip.solution;

public class TaxCalculator {
	private ILogger log;

	public TaxCalculator(ILogger log) {
		this.log = log;
	}

	public void calculateTax(int amount, int rate) {
		try {
			int tax = amount / rate;
			System.out.println(tax);
		} catch (Exception e) {
			if (log instanceof DbLogger) {
				ILogger dbLogger = new DbLogger();
				dbLogger.log(e.getMessage());
				return;
			}
			ILogger xmlLogger = new XmlLogger();
			xmlLogger.log(e.getMessage());
		}
	}
}
