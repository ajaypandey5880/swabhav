package isp.test;

import isp.solution.IEat;
import isp.solution.IWork;
import isp.solution.IWorkEat;
import isp.solution.Manager;
import isp.solution.Robot;

public class IspSolutionTest {

	public static void main(String[] args) {
		Robot robot = new Robot();
		Manager manager = new Manager();
		atTheWorkShop(manager);
		atTheCafeteria(manager);
		atTheWorkShop(robot);
		// atTheCafeteria(robot);
	}

	public static void atTheWorkShop(IWork iWork) {
		System.out.println("At The Work Shop");
		iWork.startWork();
		iWork.stopWork();
	}

	public static void atTheCafeteria(IEat iEat) {
		System.out.println("At The Cafeteria");
		iEat.startEat();
		iEat.stopEat();
	}

}
