package student;

public class TestStudent {

	public static void main(String[] args) {
		Student s1 = new Student("ajay", "pandey", 5.7f);
		Student s2 = new Student("akash", "sakariya", 7.2f);
		Student s3 = new Student("dinesh", "solanki", 8.2f);

		System.out.println(s1.getRollNO());
		System.out.println(s2.getRollNO());
		System.out.println(s3.getRollNO());
		System.out.println(s1.getRollNO());

	}

}
