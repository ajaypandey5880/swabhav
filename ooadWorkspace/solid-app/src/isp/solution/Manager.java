package isp.solution;

public class Manager implements IWorkEat{

	@Override
	public void startEat() {
		System.out.println("Manager Start Eating");
	}

	@Override
	public void stopEat() {
		System.out.println("Manager Stop Eating");
	}

	@Override
	public void startWork() {
		System.out.println("Manager start working");
	}

	@Override
	public void stopWork() {
		System.out.println("Manager stop working");
	}
	

}
