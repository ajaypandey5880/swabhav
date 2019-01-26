package lsp.voilation.test;

import lsp.solution.Rectangle;
import lsp.solution.Square;

public class lspSolutionTest {

	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle(30, 10);
		Square square = new Square(30);
		heightAndWidthShouldNotChange(rectangle);
		//heightAndWidthShouldBeChange(square);
	}

	public static void heightAndWidthShouldNotChange(Rectangle rectangle) {
		System.out.println("before Change" + rectangle.getWidth());
		rectangle.setLength(100);
		System.out.println("after change" + rectangle.getWidth() + "\n");
	}

}
