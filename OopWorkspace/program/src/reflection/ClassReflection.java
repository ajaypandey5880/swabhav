package reflection;

public class ClassReflection {
	private String name;
	private String college;
	private String company;

	public void setname(String candidateName) {
		name = candidateName;
	}

	public void setcompany(String candidateCompany) {
		company = candidateCompany;
	}

	public ClassReflection() {
		college = "Universal";
	}

	public void print() {
		System.out.println("Name of Candidate is " + name + "Company of Candidate is " + company
				+ "College of Candidate is " + college);
	}

	public String getName() {
		return name;
	}

	public String getCompany() {
		return company;
	}

	public String getCollege() {
		return college;
	}
}
