package com.app.staticProgram;

public class AddAndSubProgram
{
	public static void add(int a,int b)
	{
		System.out.println("addition result:"+(a+b));
	}
	public static int sub(int a,int b)
	{
		System.out.println("subtraction result:"+(a-b));
		return 22;
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		add(2,3);
		sub(2,3);

	}

}
