
//Develop multiThreaded program to execute to tasks concurrently
//Displaying 1-15 and 10-1

package com.app.multiThread;

public class MyRunnable2 implements Runnable
{
	@Override 
    public void run()
    {
    	for (int i=10; i>1; i--)
    	{
    		System.out.println("run :"+i);
    	}
    }
	public static void main(String[] args)
	{
		MyRunnable2 mr=new MyRunnable2();
		Thread th=new Thread(mr);
		th.start();
		
		for (int i=0; i<=15; i++)
		{
			System.out.println("main :"+i);
		}

	}

}
