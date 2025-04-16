package com.app.multiThread;

public class MyThread17 extends Thread 
{
	public void run()
	{
		for(int i=0;i<=5;i++)
		{
			System.out.println("Child Thread..");
		}
	}
	public static void main(String[] args) 
	{
       MyThread17 mt=new MyThread17();
    	 mt.start();
	}
  public void start()
   {
	  for(int i=1;i<=7;i++)
	   {
		  run();
		  System.out.println("start method.,.:"+i);
	   }
   }
  
}
