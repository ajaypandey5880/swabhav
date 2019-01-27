package isp.solution;

public class Robot implements IWork {

	@Override
	public void startWork() {
		System.out.println("Robot start Working");
	}

	@Override
	public void stopWork() {
		System.out.println("Robot stop Working");
	}

}
