package rectangleenum;

import rectangleenum.RectangleEnum.Colour;

public class TestRectangleEnum {

	public static void main(String[] args) {
		System.out.println(new RectangleEnum(10,5).calculateArea());
		RectangleEnum rectangle = new RectangleEnum(10,5);
		System.out.println(rectangle.calculateArea());
		printDetails(new RectangleEnum(10,5,Colour.green));
		printDetails(new RectangleEnum(10,5));
		
	}
	public static void printDetails(RectangleEnum rectangle) {
		System.out.println("height is "+rectangle.getHeight()+
				" width is "+rectangle.getWidth()+" area is "+rectangle.calculateArea()+
				" colour is "+rectangle.getColour());
		
	}
}
