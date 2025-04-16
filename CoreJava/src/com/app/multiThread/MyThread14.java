package com.app.multiThread;

public class MyThread14 extends Thread
{
    public void start()
    {
    	super.start();
    	for(int i=1;i<=12;i++)
    	{
    	System.out.println("no-arge run");
    	
    	}
    }
    public void run(int i)
    {
    	System.out.println("int-args run");
    }
	public static void main(String[] args)
	{
		MyThread14 mt=new MyThread14();
		mt.start();

	}

}
