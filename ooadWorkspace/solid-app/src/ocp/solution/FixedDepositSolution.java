package ocp.solution;

public class FixedDepositSolution {
	private int accountNo;
	private String name;
	private double princpal;
	private int years;
	private IRateCalculate festival;

	public FixedDepositSolution(int accountNo, String name, double princpal, int years, IRateCalculate festival) {
		this.accountNo = accountNo;
		this.name = name;
		this.princpal = princpal;
		this.years = years;
		this.festival = festival;
	}

	public int getAccountNo() {
		return accountNo;
	}

	public String getName() {
		return name;
	}

	public double getPrincpal() {
		return princpal;
	}

	public int getYears() {
		return years;
	}

	public IRateCalculate getFestival() {
		return festival;
	}
	
	public double calculateRate() {
		return princpal * years * festival.calculateRate();
	}

}
