package student;

public class Student {
	private String fName;
	private String lName;
	private float cgpa;
	static int count;
	static int headCount;
	static {
		count = 0;
		headCount = 0;
		System.out.println("hii");
	}

	public Student(String fName, String lName, float cgpa) {
		this.fName = fName;
		this.lName = lName;
		this.cgpa = cgpa;
		count++;
		headCount++;
		System.out.println("byee");
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
		return count;
	}

}
