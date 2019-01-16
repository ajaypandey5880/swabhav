package rectangleenum;

public class RectangleEnum {
	private int width;
	private int height;
	private Colour color;
	
	enum Colour{
		red,blue,green;
	}

	
	public RectangleEnum(int newHeight,int newWidth){
		height = newHeight;
		width = newWidth;

	}
	public RectangleEnum (int newHeight,int newWidth, Colour newcolour){
		height = newHeight;
		width = newWidth;
		color = newcolour;
	}
		
	
	public int getWidth() {
		return width;
	}
	
	public int getHeight() {
		return height;
	}
	public Colour getColour() {
		return color ;
	}
	public int calculateArea() {
		int area;
		area = height* width;
		return area;
	}
}
