package com.app.multiThread;

public class OverrideOfStartMethod1 extends Thread
{
    public void start()
    {
    	super.start();
    	System.out.println("start");
    }
    public void run()
    {
    	int num=11;
    	for(int i=0;i<=num;i++)
    	{
    	System.out.println("run");
    	}
    }
	public static void main(String[] args)
	{
		OverrideOfStartMethod1 om=new OverrideOfStartMethod1();
		{
			om.start();
			int num=110;
			for(int i=0;i<=num;i++)
			{
				System.out.println("main");
			}
		}
	}

}
