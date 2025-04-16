package com.app.exceptionalHandeling;

public class Check15 extends RuntimeException
{
	Check15()
	{
		super();
	}
	Check15(String msg)
	{
		super(msg);
	}

	
	public static void main(String[] args)
	{
		
	}

}
 class Check16
 {
	 public static void main(String args[])
	 {
		 try
		 {
			throw new Check15(); 
		 }
		 catch(Check15 c15)
		 {
			c15.printStackTrace(); 
		 }
	 }
 }
