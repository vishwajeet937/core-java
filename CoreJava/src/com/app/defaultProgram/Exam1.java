package com.app.defaultProgram;

public class Exam1 
{
   
  
	public static void main(String[] args)
	{
      try
      {
    	  System.out.println("Calculate:"+1/0);
      }
      catch(ArithmeticException al)
      {
    	  System.out.println("ArithmeticException");
      }
	}

}
