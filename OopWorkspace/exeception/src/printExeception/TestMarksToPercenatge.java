package printExeception;

public class TestMarksToPercenatge {

	public static void main(String[] args) {
		try {
			
			MarksToPercentage m = new MarksToPercentage();
			System.out.println(m.calcualtePercentage(50, 100));
	}catch(BadInputException b){
		b.printException();
		
	}
		
	}

}
