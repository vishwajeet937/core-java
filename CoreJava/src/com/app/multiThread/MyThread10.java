package com.app.multiThread;

public class MyThread10 extends Thread
{
    public void start()
    {
    	System.out.println("Start method");
    }
    public void run()
    {
    	System.out.println("run method");
    }
	public static void main(String[] args)
	{
		MyThread10 mt=new MyThread10();
		mt.start();
       System.out.println("main method");
	}

}
