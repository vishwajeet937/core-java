package com.app.multiThread;

public class MyThread19 extends Thread
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
    		System.out.println("catch");
    	}
    	for(int i=0;i<10;i++)
    	{
    		System.out.println("childThread");
    	}
    }
	public static void main(String[] args)
	{
		MyThread19.mt=Thread.currentThread();
		MyThread19 t19=new MyThread19();
		t19.start();
		for(int i=1;i<11;i++)
		{
			System.out.println("main Thread");
		}
		try 
		{
			Thread.sleep(2000);
		}
		catch (InterruptedException e) 
		{
			e.printStackTrace();
		}
	}
}
