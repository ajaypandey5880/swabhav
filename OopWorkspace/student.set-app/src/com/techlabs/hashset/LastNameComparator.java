package com.techlabs.hashset;
import java.util.Comparator;
import com.techlabs.student.Student;

public class LastNameComparator implements Comparator<Student> {

	@Override
	public int compare(Student student1, Student student2) {
		return student1.getlName().compareToIgnoreCase(student2.getlName());
	}

}
