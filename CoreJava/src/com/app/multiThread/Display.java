package com.app.multiThread;

public class Display
{
  /* public synchronized void wish(String name)
   {
	   for(int i=0;i<=10;i++)
	   {
	      System.out.println("Good Morning");
	       try
	        {
		      Thread.sleep(2000);
	        }
	       catch(InterruptedException e)
	       {}
	     System.out.println(name);
	   }
   }
   class MyThread extends Thread
   {
	   Display d;
	   String name;
	   
	   MyThread(Display d,String name)
	    {
		  this.d=d;
		  this.name=name;
	    }
	   public void run()
	    {
		   d.wish(name);
	    }
   }
   public static void main(String[] args)
   {
	   Display d=new Display();
	   MyThread mt1=new MyThread(d,"dhoni");
	   MyThread mt2=new MyThread(d,"youi");
	   mt1.start();
	   mt2.start();
	   
   }*/
}
