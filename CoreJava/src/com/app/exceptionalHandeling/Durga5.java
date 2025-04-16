package com.app.exceptionalHandeling;

public class Durga5 
{
	//static int a=10;
	//static int b=0;
	//public static int c=(a/b);
   public static int m1(int i,int j)
   {
	   try
	   {
		// System.out.println("print of c is:"+20/2);  
		   System.out.println(20/0);
	   }
	   catch(ArithmeticException e)
	   {
		   System.out.println("catch");
	   }
	   return 2;
   }
	public static void main(String[] args)
	{
		System.out.println("main-method");
      Durga5 d5=new Durga5();
       d5.m1(1,2);
	}

}
