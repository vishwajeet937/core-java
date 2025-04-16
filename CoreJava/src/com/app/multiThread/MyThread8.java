package com.app.multiThread;
//OverLoaded of run method program
public class MyThread8 extends Thread 
{
    public void run()
    {
    	System.out.println("no-args method");
    }
    public void run(int i)
    {
    	System.out.println("args method");
    }
	public static void main(String[] args)
	{
	   MyThread8 mt=new MyThread8();
	   mt.start();
	  
	}

}
