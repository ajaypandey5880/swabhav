package finalStaticfinal;

public class CircleArea {
	private final static float PI = 3.14f;
	private final float R;
	private float area;

	public CircleArea(float no) {
		R = no;
		area = 2 * PI * R;
		System.out.printf("%.2f", area);
	}

}
