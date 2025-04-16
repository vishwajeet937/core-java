package com.app.exceptionalHandeling;

public class Durga2
{
  public static void doStuff()
  {
	  domoreStuff();
	  System.out.println("Hi");
  }
  public static void domoreStuff()
  {
	  System.out.println("Hello");
  }
	public static void main(String[] args)
	{
		doStuff();
		System.out.println(10/0);
	}

}
