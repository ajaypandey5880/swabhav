package decorator.design.pattern;

public class Sunroof extends CarDecorator{

	public Sunroof(Car car) {
		super(car);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void assemble() {
		super.assemble();
		System.out.println("Adding Sunroof");
	}
	

}
