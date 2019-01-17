package student;

public class Student {
	private String fName;
	private String lName;
	private float cgpa;
	private int rollNo;
	static private int rollNoCounter;
	static {
		rollNoCounter = 1001;
	}

	public Student(String fName, String lName, float cgpa) {
		this.fName = fName;
		this.lName = lName;
		this.cgpa = cgpa;
		this.rollNo = rollNoCounter;
		rollNoCounter++;

	}

	public String getfName() {
		return fName;
	}

	public String getlName() {
		return lName;
	}

	public float getCgpa() {
		return cgpa;
	}

	public int getcount() {
		return rollNoCounter;
	}

	public int getRollNO() {
		return rollNo;
	}
}
