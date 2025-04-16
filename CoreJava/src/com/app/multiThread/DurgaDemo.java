package com.app.multiThread;

public class DurgaDemo {

	public static void main(String[] args)
	{
		DurgaThread dt=new DurgaThread();
         dt.start();
         for(int i=0;i<=11;i++)
         {
        	 System.out.println("mainThread");
         }
	}

}
