package rectangleenum;


public class TestRectangle {

	public static void main(String[] args) {
		System.out.println(new Rectangle(10,5).calculateArea());
		Rectangle rectangle = new Rectangle(10,5);
		
		System.out.println(rectangle.calculateArea());
		printDetails(new Rectangle(10,5,ColorEnum.GREEN));
		printDetails(new Rectangle(10,5));
		
	}
	public static void printDetails(Rectangle rectangle) {
		System.out.println("height is "+rectangle.getHeight()+
				" width is "+rectangle.getWidth()+" area is "+rectangle.calculateArea()+
				" colour is "+rectangle.getColour());
		
	}
}
