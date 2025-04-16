package com.app.multiThread;

public class OverLoadedThread1 extends Thread
{
	@Override
	public void run()
	{
		int num=11;
		for(int i=0;i<=num;i++)
		{
			if(i%2==0)
			{
			System.out.println("Even Number:"+i);
			}
		}
		
		
	}
	
	public void run(int i)
	{
		
		int num=110;
		for(int j=0;j<=11;j++)
		{
			if(j%2==1)
			{
				System.out.println("Odd Number:"+j);
			}
		}
		
	}

	public static void main(String[] args)
	{
		OverLoadedThread1 ol=new OverLoadedThread1();
		System.out.println("main method");
		ol.start();
		int num=21;
		for(int i=0;i<=num;i++)
		{
		System.out.println("main method1");
		}

	}

}
