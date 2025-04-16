package com.app.multiThread;

public class MyThread11 extends Thread
{
   public void start()
   {
	   super.start();
	   for(int i=1;i<=11;i++)
	   {
	   System.out.println("Start method");
	   }
   }
   public void run()
   {
	   for(int i=1;i<=11;i++)
	   {
	   System.out.println("run method");
	   }
   }
	public static void main(String[] args) 
	{
		MyThread11 mt=new MyThread11();
		mt.start();
		for(int i=1;i<=11;i++)
		   {
              System.out.println("main method");
		   }
	}

}
