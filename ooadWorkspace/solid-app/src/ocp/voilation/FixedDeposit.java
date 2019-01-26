package ocp.voilation;

public class FixedDeposit {
	private int accountNo;
	private String name;
	private double princpal;
	private int years;
	private FestivalOption festival;

	public FixedDeposit(int accountNo, String name, double princpal, int years, FestivalOption festival) {
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

	public FestivalOption getFestival() {
		return festival;
	}

	public double calculateSimpleInterest() {
		if (this.festival == FestivalOption.HOLI) {
			return princpal * years * 8;
		}
		if (this.festival == FestivalOption.NEW_YEAR) {
			return princpal * years * 7.5;
		}
		return princpal * years * 7;

	}
}
