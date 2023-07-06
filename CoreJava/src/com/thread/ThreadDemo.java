package com.thread;

public class ThreadDemo {
	public static void main(String[] args) {
		Thread t= Thread.currentThread();
		System.out.println(t);
		t.setName("My Thread");
		System.out.println(t);t.setPriority(7);
		System.out.println(t);
		try {
			for(int i=0;i<5;i++)
			{
				System.out.println(t+" : "+i);
				Thread.sleep(1000);
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

}
