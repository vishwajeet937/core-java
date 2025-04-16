package com.app.multiThread;

public class MyThread16 extends Thread 
{
    static Thread mt;
    public void run()
    {
    	try
    	 {
    		mt.join();
    	 }
    	catch(InterruptedException e)
    	 {
    		System.out.println("Catch");
    	 }
    	for(int i=0;i<10;i++)
    	{
    		System.out.println("Child Thread");
    	}
    }
    public static void main(String[] args) throws InterruptedException
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
