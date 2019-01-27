package isp.test;

import isp.voilation.IWorker;
import isp.voilation.Manager;
import isp.voilation.Robot;

public class IspVoilationTest {

	public static void main(String[] args) {
		Robot robot = new Robot();
		Manager manager = new Manager();
		atTheWorkShop(robot);
		atTheWorkShop(manager);
		atTheCafeteria(manager);
		atTheCafeteria(robot);
	}

	public static void atTheWorkShop(IWorker iWorker) {
		System.out.println("At The Work Shop");
		iWorker.startWork();
		iWorker.stopWork();
	}

	public static void atTheCafeteria(IWorker iWorker) {
		System.out.println("At The Cafeteria");
		try {
			iWorker.startEat();
			iWorker.stopEat();
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
		}
		
	}
}
