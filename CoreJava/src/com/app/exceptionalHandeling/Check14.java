package com.app.exceptionalHandeling;
public class Check14 
{
	public static void main(String[] args)
	{
       try
       {
    	   System.out.println("try");
       }
       finally
       {
    	   System.out.println("finally");
    	   try
    	   {
    		   System.out.println("finallyUnder-tryBlock");
    	   }
    	   catch(Exception e)
    	   {
    	      System.out.println("finallyUnder-catchBlock");
    	   }
       }
       System.out.println("After-Finally");
	}
}
