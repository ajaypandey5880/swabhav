package lsp.voilation;

public class Rectangle {
	protected int width;
	protected int length;

	public Rectangle(int width, int length) {
		this.width = width;
		this.length = length;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int calculateArea() {
		return length * width;
	}

}
