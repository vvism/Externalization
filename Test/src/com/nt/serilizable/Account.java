package com.nt.serilizable;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

@SuppressWarnings("serial")
public class Account implements Serializable{

	
	
	
	 transient int id =1;
	 String name = "Sandip";;
	 String course= 	"pune";
	
	public void readObjec(ObjectInputStream ois) throws Exception{
		ois.defaultReadObject();
		System.out.println("readObject");
	}

	private void writeObject(ObjectOutputStream oos) throws Exception{
		System.out.println("writeObject");
		oos.defaultWriteObject();
	}
	
}
