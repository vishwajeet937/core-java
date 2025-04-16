package com.app.exceptionalHandeling;

public class Check11 
{
	public static void main(String[] args)
	{
       try
       {
    	   System.out.println("try-1");
    	   try 
    	   {
    		 System.out.println("inner class in try block");   
    	   }
    	   catch(Exception e)
    	   {
    		   System.out.println("inner class in catch block");
    	   }
    	   finally
    	   {
    		   System.out.println("inner class in finally block");
    	   }
       }
       catch(Exception e)
       {
    	   System.out.println("catch-1");
       }
       finally
       {
    	   System.out.println("finally-1");
       }
	}
}
