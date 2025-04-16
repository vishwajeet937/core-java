package com.app.exceptionalHandeling;

public class Durga1 
{
	public static void doStuff()
	{
		doMoreStuff();
	}
	public static void doMoreStuff()
	{
		System.out.println("Durga");
	}

	public static void main(String[] args)
	{
		doStuff();
	}
	
}
