package com.nt.serilizable;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class SerilizableTest2 {

	
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		Account  acc =  new Account();
		
		FileOutputStream fos  =  new FileOutputStream("TaskSer.txt");
		ObjectOutputStream oos =  new ObjectOutputStream(fos);
		
		oos.writeObject(acc);
		oos.close();
		fos.close();
		
		System.out.println("Serilization End");
		
		//////////////////////////////////////////////////////
		
		System.out.println("Deserialization Start");
		
		FileInputStream  fis  =  new FileInputStream("TaskSer.txt");
		ObjectInputStream ois  =  new ObjectInputStream(fis);
		
		 Account account =(Account) ois.readObject();
		
		System.out.println(account.id+"---"+account.name+"---"+account.course);
		System.out.println("Deserilization End");
	}
}
