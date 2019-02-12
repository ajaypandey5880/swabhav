package hierarchy.builder;

import java.io.IOException;
import java.util.TreeSet;

public class FileParser {
	private Employee employee;
	private TreeSet<Employee> employees = new TreeSet<Employee>() ;

	public TreeSet<Employee> parse(FileLoader loader) throws NumberFormatException, IOException {
		for (String line : loader.readFile()) {
			String[] employeeDetail = line.split(",");
			employee = new Employee();
			employee.setEmployeeId(Integer.parseInt(employeeDetail[0]));
			employee.setEmployeeName(employeeDetail[1]);
			employee.setEmployeeDesignaton(employeeDetail[2]);
			employee.setManagerID((employeeDetail[3]));
			employee.setJoiningDate((employeeDetail[4]));
			employee.setSalary(Integer.parseInt(employeeDetail[5]));
			employee.setCommision(employeeDetail[6]);
			employee.setDepartmentNo(Integer.parseInt(employeeDetail[7]));
			employees.add(employee);
		}
		return employees;
	}
}
