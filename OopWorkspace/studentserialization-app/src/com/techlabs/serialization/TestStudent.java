package com.techlabs.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestStudent {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Student student = new Student("ajay", "pandey");
		String filename = "D:\\programs\\serial.txt";
		FileOutputStream file = new FileOutputStream(filename);
		ObjectOutputStream out = new ObjectOutputStream(file);
		out.writeObject(student);
		System.out.println("data before serailization is " + student.getfName() + student.getlName());
		out.close();
		file.close();

		FileInputStream file1 = new FileInputStream(filename);
		ObjectInputStream out1 = new ObjectInputStream(file1);
		student = (Student) out1.readObject();
		out1.close();
		file1.close();
		System.out.println("data after deserialization is " + student.getfName() + student.getlName());

	}

}
