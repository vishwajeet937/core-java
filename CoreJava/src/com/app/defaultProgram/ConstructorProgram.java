package com.app.defaultProgram;

public class ConstructorProgram
{
	static
	{
		System.out.println("Static");
	}
	ConstructorProgram()
	{
		this(1);
		System.out.println("Zero Parrem");
	}
	ConstructorProgram(int i)
	{
		this(1,"s");
		System.out.println("one Parrem");
	}
	ConstructorProgram(int i,String s)
	{
		System.out.println("two Parrem");
	}
	public static void main(String[] args) 
	{
		ConstructorProgram cp=new ConstructorProgram(12);
		
	}
	static
	{
		System.out.println("staric-1");
	}

}
