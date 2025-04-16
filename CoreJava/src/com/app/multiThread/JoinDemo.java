package com.app.multiThread;

public class JoinDemo extends Thread
{
	public void run()
	{
		for(int i=0;i<20;i++)
		{
			System.out.println(getName()+":"+i);
			
		   if(i==5&&getName().equals("childs2"))
		  {
			try
			{
				Thread.sleep(500);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		  }
		}
	}
	public static void main(String[] args) throws InterruptedException
	{
		System.out.println("main is started");
		JoinDemo jd1=new JoinDemo();
		jd1.setName("chid1");
		jd1.start();
		
		JoinDemo jd2=new JoinDemo();
		jd2.setName("child2");
		jd2.start();
		
		jd1.join();
		jd2.join();
		System.out.println("main is exited");
	}
}
