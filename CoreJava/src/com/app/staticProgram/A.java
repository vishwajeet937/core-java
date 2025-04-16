package com.app.staticProgram;

public class A 
  {
	static int a=m1();
	static int m1()
	{
		System.out.println("sv-1");
		return 1;
	}
	static
	{
		System.out.println("sb-1");
	}

  }
class B extends A
  {
	static int b=m2();
	static int m2()
	{
		System.out.println("sv-2");
		return 2;
	}
	static
	{
		System.out.println("sb-2");
	}
  public static void main(String[] args)
  {
	 B b1=new B(); 
	 System.out.println("main method");
  }
}
