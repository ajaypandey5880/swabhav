package decorator.design.pattern;

public class BasicCar implements Car{

	@Override
	public void assemble() {
		System.out.println("Car with Body And Wheels");
	}

}
