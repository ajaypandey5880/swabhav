package dip.voilation;

public class TaxCalculator {
	private LogType log;

	public TaxCalculator(LogType log) {
		this.log = log;
	}

	public void calculateTax(int amount, int rate) {
		try {
			int tax = amount / rate;
		} catch (Exception e) {
			if (this.log == LogType.DB) {
				DbLogger dbLogger = new DbLogger();
				dbLogger.log(e.getMessage());
				return;
			}
			XmlLogger xmlLogger = new XmlLogger();
			xmlLogger.Log(e.getMessage());
		}
	}
}
