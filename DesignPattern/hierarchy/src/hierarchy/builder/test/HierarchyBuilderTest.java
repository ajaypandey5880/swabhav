package hierarchy.builder.test;

import java.util.ArrayList;
import java.util.Set;

import hierarchy.builder.Employee;
import hierarchy.builder.FileLoader;
import hierarchy.builder.FileParser;
import hierarchy.builder.HierarchyBuilder;

public class HierarchyBuilderTest {

	public static void main(String[] args) throws Exception {
		FileLoader fileLoader=new FileLoader("D:\\programs\\dataFile.txt");
		ArrayList<String> list=fileLoader.loadFile();
		
		FileParser employeeParser=new FileParser();
		Set<Employee> empSet=employeeParser.parse(list);
		
		HierarchyBuilder heirarchyBuilder=new HierarchyBuilder(empSet);
		Employee root=heirarchyBuilder.getCeo();
		System.out.println(root.display());
	}
}
