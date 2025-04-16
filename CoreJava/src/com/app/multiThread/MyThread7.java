package com.app.multiThread;

public class MyThread7 extends Thread 
{

	public static void main(String[] args)
	{
		MyThread7 mt=new MyThread7();
		mt.start();
		mt.run();
	}
		public void run()
		{
			for (int i=1;i<=5;i++)
			{
				System.out.println("Main Thread");
			}
		}

	}


