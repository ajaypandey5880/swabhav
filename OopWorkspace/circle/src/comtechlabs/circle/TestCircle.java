package comtechlabs.circle;

public class TestCircle {

	public static void main(String[] args) {
		Circle bigCircle = new Circle();
		Circle temp = bigCircle;
		bigCircle.setradius(5.5f);

		Circle smallCircle = new Circle();
		smallCircle.setradius(1.5f);

		printDetails(smallCircle);
		printDetails(bigCircle);

		temp.setradius(2.0f);
		System.out.println(temp.getradius());
		System.out.println(bigCircle.getradius());

		temp = null;
		// System.out.println(temp.getradius());
		System.out.println(bigCircle.getradius());

		Circle[] manyCircle = new Circle[3];
		Circle c1 = new Circle();
		Circle c2 = new Circle();
		Circle c3 = new Circle();
		manyCircle[0] = c1;
		manyCircle[1] = c2;
		manyCircle[2] = c3;
		c1.setradius(2.5f);
		c2.setradius(4.5f);
		c3.setradius(3.5f);
		printDetails(manyCircle);
		findBiggerCircle(manyCircle);
		Circle big = findBiggerCircle(manyCircle);
		printDetails(big);
		// System.out.println("biggest circle is "+big.getradius());

	}

	private static void printDetails(Circle circle) {
		System.out.println("Area is " + circle.calculateArea() + " Perimeter is " + circle.calculatePerimeter()
				+ " radius is " + circle.getradius());
	}

	private static void printDetails(Circle[] circle) {
		for (Circle circle1 : circle) {
			printDetails(circle1);
		}
	}

	private static Circle findBiggerCircle(Circle[] circle) {
		int p = 0;
		Circle c = circle[0];
		for (int i = 0; i < circle.length; i++) {
			if (circle[p].getradius() < circle[i].getradius()) {
				p = i;
			}
		}
		c = circle[p];
		return c;

	}

}
