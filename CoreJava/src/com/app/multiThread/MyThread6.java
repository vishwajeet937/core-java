package com.app.multiThread;

public class MyThread6 extends Thread
{
	static Thread mt;
	public void run()
   	{
		try
		{
			mt.join();
		}
		catch(InterruptedException e)
		{}
		for(int i=0;i<=10;i++)
		{
			System.out.println("Child Thread");
		}
   	}

	public static void main(String[] args)throws InterruptedException 
	{
		MyThread6.mt=Thread.currentThread();
		MyThread6 t=new MyThread6();
		t.start();
		
		for(int i=0;i<11;i++)
		{
			System.out.println("main-Thread");
			Thread.sleep(2000);
		}

	}

}
