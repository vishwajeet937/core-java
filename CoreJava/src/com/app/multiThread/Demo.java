package com.app.multiThread;

public class Demo extends Thread 
{
   public synchronized void odd(int range)
   {
	   for(int i=1;i<=range;i++)
	   {
		   if(i%2==1)
		   System.out.println("odd:"+i);
	   }
   }
   
   public synchronized void even(int range)
    {
	   for(int i=1;i<=range;i++)
	   {
		   if(i%2==0)
		   {
		   System.out.println("even:"+i);
		   }
	   }
    }
	public static void main(String[] args) 
	{
		Demo d=new Demo();
		Thread t=new Thread()
	   {
		public void run()
		{
			d.odd(7);
		}
	   };
		t.start();
		
		Thread t1=new Thread()
		 {
			public void run()
			{
				d.even(22);
			}
		 };
		 t1.start();
		
		for(int i=1;i<=9;i++)
		{
			System.out.println("main method");
		}

	}

}
