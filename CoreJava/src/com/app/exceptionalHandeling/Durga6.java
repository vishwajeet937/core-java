package com.app.exceptionalHandeling;

public class Durga6 
{
  public static void main(String[] args)
  {
	  System.out.println("Start1");
	  try
	  {
		  System.out.println(10/0);
	  }
	  catch(ArithmeticException ae)
	  {
		  System.out.println(10/2);
	  }
	  System.out.println("Stert-end");
  }
}
