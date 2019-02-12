package hierarchy.builder.test;

import java.io.IOException;
import java.util.List;

import hierarchy.builder.Employee;
import hierarchy.builder.FileLoader;
import hierarchy.builder.FileParser;
import hierarchy.builder.HierarchyBuilder;

public class HierarchyBuilderTest {

	public static void main(String[] args) throws NumberFormatException, IOException {
		FileLoader loader = new FileLoader();
		FileParser parser = new FileParser();
		HierarchyBuilder builder = new HierarchyBuilder();
		List<Employee> list = builder.heirarchy(parser.parse(loader));
		for(int i = 0 ;i<list.size();i++) {
		System.out.println(list.get(i).getEmployeeName());
		}
	}

}
