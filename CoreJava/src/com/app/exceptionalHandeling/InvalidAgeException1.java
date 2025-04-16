package com.app.exceptionalHandeling;

//import java.util.Scanner;

public class InvalidAgeException1 
{
	public static void valied(int age)throws InvalidAgeException,Exception
	{
		
		if(age<18)
		{
			throw new InvalidAgeException("age is not valied to vhote");
		}
		else
		{
			System.out.println("Welcome to vote");
			Thread.sleep(10000);
		} 
	}
    public static void main(String[] args)throws Exception
    {
    	
    	try 
    	{
    		InvalidAgeException1.valied(18);
    	}
    	catch(InvalidAgeException iex)
    	{
    		System.out.println("Cought the exception");
    		 System.out.println("Exception occured: " + iex);
    	}
    	System.out.println("rest of the code...");  
    }
}
