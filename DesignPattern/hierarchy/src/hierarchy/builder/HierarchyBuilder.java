package hierarchy.builder;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class HierarchyBuilder {
	List<Employee> list = new ArrayList<Employee>();
	
	public List<Employee> heirarchy(TreeSet<Employee> employee) {
		for(Employee employee2 : employee) {
			if(employee2.getManagerID().equals("NULL")) {
				list.add(employee2);
				//employee.remove(employee2);
			}
		}
		for(Employee employee2 : employee) {
			if( !employee2.getManagerID().equals("NULL") && Integer.parseInt(employee2.getManagerID()) == (list.get(0).getEmployeeId())) {
				list.add(employee2);
			}
		}
		for(Employee employee2 : employee) {
			
		}
		return list;
	}
}
