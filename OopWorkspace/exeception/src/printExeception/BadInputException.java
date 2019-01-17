package printExeception;

public class BadInputException extends Exception {

	public void lessMarks(float marks, float total) {
		if (marks > total);
	}
	
	public void printException() {
		System.out.println("Marks ontained is less then total");
	}
}
