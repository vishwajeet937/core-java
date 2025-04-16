package com.app.exceptionalHandeling;

public class Demo 
{
	public int m1(int i,int i1)
	{
	try
	{
		System.out.println("try-block");
	}
	catch(Exception e)
	{
		System.out.println("catch-block");
	}
	finally
	{
		System.out.println("finally-block");
	}
	return 101;
}	
	
   public static void main(String[] args)
   {
	   System.out.println("how are you");
	   Demo d=new Demo();
	   d.m1(1,2);
   }
}
