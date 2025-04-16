package com.app.multiThread;

public class MyThread1 extends Thread
{
    public void run()
    {
    	for(int i=1;i<=10;i++)
    	{
    		System.out.println("Child Thread");
    		try
    		{
    			Thread.sleep(1000);
    		}
    		catch(InterruptedException ie)
    		{
    			//System.out.println("catch");
    		}
    		
    	}
    }
	public static void main(String[] args)throws InterruptedException
	{
	MyThread1 mt=new MyThread1();
	mt.start();
	mt.join(2000);
	  for(int i=1;i<=11;i++)
	  {
		System.out.println("main Thread");
	  }

	}

}
