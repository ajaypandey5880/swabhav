package isp.voilation;

public class Manager implements IWorker {

	@Override
	public void startWork() {
		System.out.println("Worker start working");
	}

	@Override
	public void stopWork() {
		System.out.println("Worker stop working");
	}

	@Override
	public void startEat() {
		System.out.println("Worker start Eating");
	}

	@Override
	public void stopEat() {
		System.out.println("Worker stop Eating");
	}

}
