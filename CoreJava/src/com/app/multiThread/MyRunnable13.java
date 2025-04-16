package com.app.multiThread;

public class MyRunnable13 implements Runnable
{
	@Override
     public void run()
     {
    	 
    	 System.out.println("run");
     }
     public void run(int i)
     {
    	 System.out.println("run1");
     }

     	public static void main(String[] args) 
	{
		MyRunnable13 mr13=new MyRunnable13();
		Thread t=new Thread(mr13);
		t.start();

	}

}
