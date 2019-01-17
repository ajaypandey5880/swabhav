package rectangleenum;

public class Rectangle {
	private int width;
	private int height;
	private ColorEnum color;
	public Rectangle(int newHeight,int newWidth){
		height = newHeight;
		width = newWidth;

	}
	public Rectangle (int newHeight,int newWidth, ColorEnum newcolor){
		height = newHeight;
		width = newWidth;
		color = newcolor;
	}
		
	
	public int getWidth() {
		return width;
	}
	
	public int getHeight() {
		return height;
	}
	public ColorEnum getColour() {
		return color ;
	}
	public int calculateArea() {
		int area;
		area = height* width;
		return area;
	}
}
