
//Develop multiThreaded program to execute to tasks concurrently
//Displaying 1-20 and 10-1
package com.app.multiThread;

class MyThread2 extends Thread
{
	@Override
    public void run()
    { 
		for(int i=10;i>=1;i--)
		{
    	System.out.println("run:"+i);
		}
    }
	public static void main(String[] args)
	{
		MyThread2 mt=new MyThread2();
	    mt.start();
		for (int i=0;i<=20;i++)
		{
			System.out.println("main:"+i);
		}
		

	}

}
