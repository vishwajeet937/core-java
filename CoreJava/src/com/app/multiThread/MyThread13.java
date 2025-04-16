package com.app.multiThread;

public class MyThread13 extends Thread
{
    public void run()
    {
    	this.run(1);
    	for(int i=0;i<10;i++)
    	{
    		System.out.println("Child Thread");
    	}
    }
    public void start()
    {
    	super.start();
    	System.out.println("start method");
    }
    public void run(int i)
    {
    	System.out.println("run1");
    }
   
	public static final void main(String[] a)
	{
		MyThread13 mt=new MyThread13();
		mt.start();
		

	}

}
