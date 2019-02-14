package hierarchy.builder;

import java.util.ArrayList;
import java.util.List;

public class Employee implements Comparable<Employee>{
	private Integer empId;
	private Integer mangerId;
	private String name;
	private String designation;
	private StringBuffer data = new StringBuffer();
	private List<Employee> reportee = new ArrayList<Employee>();

	public Employee(Integer empId, Integer mangerId, String name, String designation) {
		this.empId = empId;
		this.mangerId = mangerId;
		this.name = name;
		this.designation = designation;
	}
	public StringBuffer display() {
		data.append(name);
		data.append("\n");
		for (Employee e : reportee) {
			data.append("\t");
			data.append(" "+e.display());
			//data.append("\t");
		}
			
		return data;
	}

	public Integer getEmpId() {
		return empId;
	}

	public Integer getMangerId() {
		return mangerId;
	}


	public String getDesignation() {
		return designation;
	}

	public void addRepotee(Employee employee) {
		reportee.add(employee);
	}

	public String getName() {
		return name;
	}

	public List<Employee> getReportee() {
		return reportee;
	}

	@Override
	public int compareTo(Employee o) {
		return this.empId - o.empId;
	}


}
