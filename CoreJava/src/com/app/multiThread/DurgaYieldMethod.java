package com.app.multiThread;

public class DurgaYieldMethod extends Thread
{
    public  void run()
     {
    	for(int i=0;i<110;i++)
    	{
    		System.out.println("Child Thread");
    		Thread.yield();
    	}
     }
     
	public static void main(String[] args)
	{
		DurgaYieldMethod dym=new DurgaYieldMethod();
        dym.start();
        
        for(int i=0;i<11;i++)
        {
        	System.out.println("Main Thread");
        }
        
	}

}
