package com.nt.serilizable;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class SerilizableTest {

	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		Student student1  =  new Student();
		Student student2  =  new Student();
		Student student3  =  new Student();
		
		student1.setId(1);
		student1.setName("Rahul");
		student1.setCourse("MCA");
		student1.setCity("Gaya");
		
		student2.setId(2);
		student2.setName("Neha");
		student2.setCourse("BCA");
		student2.setCity("Nagpur");
		
		student3.setId(3);
		student3.setName("Trupti");
		student3.setCourse("MCA");
		student3.setCity("Pune");
		
		
		ArrayList<Student> al =  new ArrayList<>();
		al.add(student1);
		al.add(student2);
		al.add(student3);
		
		System.out.println("Serilization Start");
		
		FileOutputStream fos  =  new FileOutputStream("Task.txt");
		ObjectOutputStream oos =  new ObjectOutputStream(fos);
		
		oos.writeObject(al);
		
		
		oos.close();
		fos.close();
		
		System.out.println("Serilization End");
		
		System.out.println("Deserialization Start");
		
		FileInputStream  fis  =  new FileInputStream("Task.txt");
		ObjectInputStream ois  =  new ObjectInputStream(fis);
		
		 
		
		System.out.println(ois.readObject().toString());
		
		System.out.println("Deserilization End");
	}
}
