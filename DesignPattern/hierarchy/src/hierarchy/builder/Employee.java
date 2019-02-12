package hierarchy.builder;

import java.util.List;

public class Employee implements Comparable<Employee>{
	private int employeeId;
	private String employeeName;
	private String employeeDesignaton;
	private String managerID;
	private String joiningDate;
	private double salary;
	private String commision;
	private int departmentNo;
	private List<Employee> reportee;

	public String getJoiningDate() {
		return joiningDate;
	}

	public void setJoiningDate(String joiningDate) {
		this.joiningDate = joiningDate;
	}

	public String getManagerID() {
		return managerID;
	}

	public void setManagerID(String managerID) {
		this.managerID = managerID;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeeDesignaton() {
		return employeeDesignaton;
	}

	public void setEmployeeDesignaton(String employeeDesignaton) {
		this.employeeDesignaton = employeeDesignaton;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getCommision() {
		return commision;
	}

	public void setCommision(String employeeDetail) {
		this.commision = employeeDetail;
	}

	public int getDepartmentNo() {
		return departmentNo;
	}

	public void setDepartmentNo(int departmentNo) {
		this.departmentNo = departmentNo;
	}

	public List<Employee> getReportee() {
		return reportee;
	}

	public void setReportee(List<Employee> reportee) {
		this.reportee = reportee;
	}

	@Override
	public int compareTo(Employee o) {
		
		return this.employeeId - o.getEmployeeId();
	}

}
