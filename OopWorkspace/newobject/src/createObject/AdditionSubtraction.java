package createObject;

public class AdditionSubtraction implements Cloneable{
	private int a;
	private int b;

	public int getAdditon() {
		return a + b;
	}

	public int getSubtraction() {
		return a - b;
	}

	public void setNos(int a, int b) {
		this.a = a;
		this.b = b;
	}
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
		
	}

}
