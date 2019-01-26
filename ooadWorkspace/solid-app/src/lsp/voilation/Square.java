package lsp.voilation;

public class Square extends Rectangle {

	public Square(int width, int length) {
		super(width, length);
	}
	
	@Override
	public void setWidth(int width) {
		super.width = super.length = width;
	}
	
	@Override
	public void setLength(int length) {
		super.width = super.length = length;
	}
}
