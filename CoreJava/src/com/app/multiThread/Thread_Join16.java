package com.app.multiThread;

public class Thread_Join16
{
	 public static void main(String[] args)throws InterruptedException 
		{
			MyThread16.mt=Thread.currentThread();
			MyThread t=new MyThread();
			t.start();
			for(int i=0;i<10;i++)
			{
			  System.out.println("main Thread");	
			}
			Thread.sleep(2000);
		}
}
