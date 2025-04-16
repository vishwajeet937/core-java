package com.app.NatarajSir;
//import java.lang.Class;
//TestApp.java
//class1
public class Test
{
   //static block
	static
	{
		System.out.println("Test: static Block");
	}
	//0-parrem user define constructor,not the default constructor
	public Test()
	{
		this(11);
		System.out.println("Test: 0-Parrem Constructor");
	}
	public Test(int i)
	{
		System.out.println("Test: 1-parrem Constructor");
	}
}
	//class2
	class Demo
	{
		//static block
		static
		{
			System.out.println("Demo: static block");
		}
		//constructor
		public Demo()
		{
			System.out.println("Demo: 0-parrem Constructor");
		}
	}

	


