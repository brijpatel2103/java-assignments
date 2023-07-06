package com.file;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputOutputStreamDemo {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos=new FileOutputStream("demo.txt");
		String s="\nThis is file management using Java.";
		byte b[]=s.getBytes();
		fos.write(b);
		fos.flush();
		fos.close();
		System.out.println("File Witten Successfully");
		
		FileInputStream fis=new FileInputStream("demo.txt");
		int i;
		while ((i=fis.read())!=-1)
		{
			System.out.print((char)i);
		}
		fis.close();
	}

}
