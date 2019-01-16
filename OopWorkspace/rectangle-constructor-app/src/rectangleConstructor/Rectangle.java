package rectangleConstructor;

public class Rectangle {
	private int width;
	private int height;
	private String colour = "blue";

	
	public Rectangle(int newHeight,int newWidth){
		height = newHeight;
		width = newWidth;

	}
	public Rectangle(int newHeight,int newWidth, String newcolour){
		if (newcolour.equals("green") || newcolour.equals("blue") || newcolour.equals("red")) {
			colour = newcolour;
		}
		
	}
	
	public int getWidth() {
		return width;
	}
	
	public int getHeight() {
		return height;
	}
	public String getColour() {
		return colour;
	}
	public int calculateArea() {
		int area;
		area = height* width;
		return area;
	}

	
	
	

}
