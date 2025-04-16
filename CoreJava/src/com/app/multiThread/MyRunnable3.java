package com.app.multiThread;

public class MyRunnable3 implements Runnable
{
  public void run()
   {
	  for(int i=1;i<=5;i++)
	  {
		  System.out.println("run method");
	  }
   }
	public static void main(String[] args)
	{
		MyRunnable3 mr=new MyRunnable3();
		Thread t=new Thread(mr);
		t.start();
		
		for(int i=2;i<=12;i++)
		{
		System.out.println("main thread-"+i);
		}
	}

}
