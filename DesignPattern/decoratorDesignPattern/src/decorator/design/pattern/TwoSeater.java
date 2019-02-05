package decorator.design.pattern;

public class TwoSeater extends CarDecorator {

	public TwoSeater(Car car) {
		super(car);
	}
	
	@Override
	public void assemble() {
		super.assemble();
		System.out.println("Adding two seat");
	}

}
