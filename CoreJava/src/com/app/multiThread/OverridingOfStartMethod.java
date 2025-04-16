package com.app.multiThread;

public class OverridingOfStartMethod extends Thread 
{
     public void start()
     {
    	 super.start();
    	 System.out.println("start -method");
     }
     public void run()
     {
    	 System.out.println("run-method");
     }
	public static void main(String[] args) 
	{
		System.out.println("main method1");
		OverridingOfStartMethod ofsm=new OverridingOfStartMethod();
		ofsm.start();
		//System.out.println("main method");
		ofsm.start();

	}

}
