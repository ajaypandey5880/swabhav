package printExeception;

public class MarksToPercentage {
	private float total;
	private float Marks;
	private float percentage;
	
	public float calcualtePercentage(float total,float marks)throws BadInputException{
		
		if(marks>total) {
		throw new BadInputException();
		}
		if(marks<total) {
			percentage = marks/total * 100;
		}
		return percentage;
	}


			
			
	
}
