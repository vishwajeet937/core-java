package com.app.multiThread;

public class OverLoadedThread extends Thread
{
	public void run()
	{
		System.out.println("no-args run ");
	}
	public void run(int i)
	{
		System.out.println("int-arg run");
	}

	public static void main(String[] args)
	{
		OverLoadedThread olt=new OverLoadedThread();
		olt.start();

	}

}
