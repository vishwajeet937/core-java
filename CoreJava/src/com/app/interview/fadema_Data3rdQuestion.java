package com.app.interview;

public class fadema_Data3rdQuestion
{

	public static void main(String[] args)
	{
		try
		{
			System.out.print("Hello"+" "+1/0);
		}
		catch(ArithmeticException ae)
		{
			System.out.print("World");
		}

	}

}
