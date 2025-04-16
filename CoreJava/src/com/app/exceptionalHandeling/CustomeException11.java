package com.app.exceptionalHandeling;

public class CustomeException11 extends Exception
{
  public CustomeException11(String message)
  {
	  super(message);
  }
}
  class ThrowExample
{
	public static void main(String[] args)
	{
		try
		{
			int result=divided(10,0);
			System.out.println("Result:"+result);
		}
	  	catch(CustomeException11 e)
		{
		  System.out.println("Error:"+e.getMessage());	
		}
		catch(Exception n)
		{
			System.out.println("catch");
		}
	}
   public static int divided(int numerator,int denominator)throws CustomeException11
   {
	   if(denominator==0)
	   {
		   throw new CustomeException11("Division by Zero is not allowed");
	   }
	   return numerator/denominator;
   }
}
