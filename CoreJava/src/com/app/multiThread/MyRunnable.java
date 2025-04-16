package com.app.multiThread;

 class MyRunnable implements Runnable
{
	@Override
	public void run()
	{
		System.out.println("run execute");
	}

	public static void main(String[] args) 
	{
	  MyRunnable mr=new MyRunnable();
	   //mr.start();
	   Thread th=new Thread(mr);
	   th.start();
	   System.out.println("main execute");

	}

}
