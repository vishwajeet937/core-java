package com.app.multiThread;

public class AnnonamisInerClass 
{
	 public void m1()
	{
		System.out.println("parents class");
	}
}
class AnnonamisInerClass1 extends AnnonamisInerClass
{
	public void m1()
	{
		System.out.println("child class");
	}

	public static void main(String[] args)
	{
		//AnnonamisInerClass1 aic=new AnnonamisInerClass1();
		//aic.m1();
		
		AnnonamisInerClass1 aic01=new AnnonamisInerClass1() {
			public void m1()
			{
							}
		};
		System.out.println((aic01.getClass())+"anonymous inner class class");
		aic01.m1();
		System.out.println(Thread.currentThread().getName());
	}
	
}
