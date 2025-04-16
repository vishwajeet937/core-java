package com.app.exceptionalHandeling;
public class Check9
{
	public static void main(String[] args)
	{
		try
		{
			System.out.println("try");
			try 
			{
				 throw new Exception("exception1"); 
			}
			catch(Exception e)
			{
				System.out.println("Catch-block");
			}
			finally
			{
				System.out.println("finally block");
			}
		}
			finally
			{
				System.out.println("tri with finally");
				try
				{
					System.out.println("finally with try");
				}
				finally
				{
					System.out.println("try finally 1");
				}
			}
		

	}

}
