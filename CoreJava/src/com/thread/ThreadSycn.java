package com.thread;
class callback
{
	public void call(String msg)
	{
		System.out.print("["+msg);
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("]");
	}
}
class caller implements Runnable
{
	String msg;
	Thread t;
	callback c;
	public caller(String msg,callback c) {
		this.msg=msg;
		this.c=c;
		t=new Thread(this);
		t.start();
		
	}

	public void run() {
		synchronized (msg) {
			c.call(msg);
		}
	}
	
}
public class ThreadSycn {
	public static void main(String[] args) {
		callback c=new callback();
		
		caller c1=new caller("Hello",c);
		caller c2=new caller("World",c);
		caller c3=new caller("Synchronization",c);
		
	}
}
