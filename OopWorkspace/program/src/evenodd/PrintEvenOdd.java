package evenodd;

public class PrintEvenOdd {
	private int range;

	public int getRange() {
		return range;
	}

	public void setRange(int x) {
		range = x;
	}

	public void printEvenNo() {
		System.out.println("even no are");
		for (int i = 2; i < range; i += 2) {
			System.out.print(" " + i);
		}
	}

	public void printOddNo() {
		System.out.println("odd no are");
		for (int i = 1; i <= range; i += 2) {
			System.out.print(" " + i);

		}
	}
}
