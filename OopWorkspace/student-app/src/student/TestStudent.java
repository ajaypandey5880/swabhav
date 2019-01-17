package student;

public class TestStudent {

	public static void main(String[] args) {
		Student s1 = new Student("ajay", "pandey", 5.7f);
		System.out.println(s1.getcount());
		System.out.println("head count is"+Student.headCount);

		Student s2 = new Student("ajay", "pandey", 5.7f);
		System.out.println(s1.getcount());
		System.out.println("head count is "+Student.headCount);

		Student s3 = new Student("ajay", "pandey", 5.7f);
		System.out.println(s1.getcount());
		System.out.println("head count is "+Student.headCount);

	}

}
