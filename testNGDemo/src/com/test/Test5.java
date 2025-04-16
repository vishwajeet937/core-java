package com.test;


public class Test5 
{

	static
	{
		System.out.println("static");
	}
	@org.testng.annotations.Test
	public static void m1()
	{
		System.out.println("m1");
	}
	Test5()
	{
		System.out.println("zero-parrem constructor");
	}
	{
		System.out.println("non-static");
	}
@org.testng.annotations.Test
	public void m2()
	{
		try
		{
			int dev=12/3;
			System.out.println("m2-try:"+dev);
		}
		catch (Exception e)
		{
			System.out.println("catch");
		}
	}
@org.testng.annotations.Test
	public void m3()
	{
		try
		{
			System.out.println("m3-try.");
			throw new ArithmeticException();
		}
		catch (RuntimeException r)
		{
			System.out.println("m3-catch.");
		}
	}
@org.testng.annotations.Test
	public static void main(String[] args) 
	{
		Test5 c=new Test5();
		c.m2();
		c.m3();
		
		try
		{
			int i=12;
			int j=2;
			System.out.println(i/j);
		}
		catch (ArithmeticException a)
		{
			System.out.println("catch");
		}
		
		finally 
		{
			System.out.println("finally");
		}
		System.out.println("Hello World!");
		c.m1();
	}
}


