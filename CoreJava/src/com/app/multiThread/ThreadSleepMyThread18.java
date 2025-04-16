package com.app.multiThread;

public class ThreadSleepMyThread18
{
	public static void main(String[] args)
	{
		MyThread18 t18=new MyThread18();
		t18.start();
		t18.interrupt();
		System.out.println("main Thread");		
	}
}
