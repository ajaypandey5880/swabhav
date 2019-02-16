package hierarchy.builder;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HierarchyBuilder {
	private Employee rootEmployee = null;
	private Map<Integer, Employee> empMap = new HashMap<Integer, Employee>();

	public HierarchyBuilder(Set<Employee> empSet) {
		for (Employee employee : empSet) {
			empMap.put(employee.getEmpId(), employee);
		}
		getHeirachy();
	}

	public Employee getRoot() {
		for (Employee employee : empMap.values()) {
			if (employee.getMangerId() == null) {
				return rootEmployee = employee;
			}
		}
		return rootEmployee;
	}

	public void getHeirachy() {
		for (Map.Entry<Integer, Employee> entry : empMap.entrySet()) {
			if (empMap.containsKey(entry.getValue().getMangerId())) {
				Employee employee = empMap.get(entry.getValue().getMangerId());
				employee.addRepotee(entry.getValue());
			}
		}
	}
}
