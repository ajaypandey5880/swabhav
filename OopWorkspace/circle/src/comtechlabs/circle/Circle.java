package comtechlabs.circle;

public class Circle {
	private float radius;
	private final float PI = 3.14f;

	public float getradius() {
		return radius;
	}

	public void setradius(int newRadius) {
		if (newRadius < 0) {
			newRadius = 1;
		}
		radius = newRadius;
	}

	public float calculateArea() {
		float area = PI * radius * radius;
		return area;

	}

	public float calculatePerimeter() {
		float perimeter = 2 * PI * radius;
		return perimeter;
	}
}
