package ocp.voilationtest;

import ocp.solution.FixedDepositSolution;
import ocp.solution.HoliFestival;
import ocp.voilation.FestivalOption;
import ocp.voilation.FixedDeposit;

public class TestFixedDeposit {

	public static void main(String[] args) {
		FixedDeposit fixedDeposit = new FixedDeposit(1, "ajay", 100000, 10, FestivalOption.HOLI);
		System.out.println("Fixed deposit value :\t" + fixedDeposit.calculateSimpleInterest());

		FixedDepositSolution depositSolution = new FixedDepositSolution(1, "amar", 100000, 10, new HoliFestival());
		System.out.println("Fixed deposit value :\t" + depositSolution.calculateRate());
	}
}
