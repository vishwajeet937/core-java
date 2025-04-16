package com.app.multiThread;

public class MyThread18 extends Thread
{
	public void run()
	{
		for(int i=0;i<=10000 ;i++)
		{
			System.out.println("i'm leazy Thread:"+i);
		}
		System.out.println("i'm entering into sleeping state");
		try
		{
			Thread.sleep(10000);
		}
		catch(InterruptedException e)
		{
			System.out.println("i got Interrupted");
		}
	}

	/*public static void main(String[] args)
	{
		MyThread18 t18=new MyThread18();
		t18.start();
		t18.interrupt();
		System.out.println("main Thread");		
	}*/
}
