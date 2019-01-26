package lsp.voilation.test;

import lsp.voilation.Rectangle;
import lsp.voilation.Square;

public class lspVoliationTest {

	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle(30, 10);
		Square square = new Square(30, 30);
		heightAndWidthShouldBeChange(rectangle);
		heightAndWidthShouldBeChange(square);
	}
	
	public static void heightAndWidthShouldBeChange(Rectangle rectangle) {
		System.out.println("before Change"+rectangle.getWidth()); 
		rectangle.setLength(100);
		System.out.println("after change"+rectangle.getWidth()+"\n");
	}

}
