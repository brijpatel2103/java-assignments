package com.file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable
{
	int rno;
	String sname;
	double per;
	public Student(int rno, String sname, double per) {	
		this.rno = rno;
		this.sname = sname;
		this.per = per;
	}
	public String toString() {
		return "Roll No : "+rno+"\nStudent Name : "+sname+"\nPercentage : "+per;
		
	}
	
	
}
public class SerializationDemo {
	public static void main(String[] args) throws Exception {
		Student s1=new Student(1, "Brijesh", 70.65);
		
		FileOutputStream fos=new FileOutputStream("ser");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(s1);
		oos.flush();
		oos.close();
		
		FileInputStream fis=new FileInputStream("ser");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Student s2=(Student)ois.readObject();
		ois.close();
		System.out.println(s2);
	}

}
