package comtechlabs.circle;

public class TestCircle {

	public static void main(String[] args) {
		Circle circle = new Circle();
		circle.getradius();
		circle.setradius(-5);
		System.out.println(circle.calculateArea());
		System.out.println(circle.calculatePerimeter());
	}

}
