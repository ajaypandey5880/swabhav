package decorator.design.pattern;

public class FourSeater extends CarDecorator{

	public FourSeater(Car car) {
		super(car);
	}
	
	@Override
	public void assemble() {
		super.assemble();
		System.out.println("adding four seater");
	}
	
}
