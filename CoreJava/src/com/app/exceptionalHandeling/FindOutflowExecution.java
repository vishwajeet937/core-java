package com.app.exceptionalHandeling;

public class FindOutflowExecution
{

	public static void main(String[] args)throws Exception
	{
		try
		{
			throw new Exception("Exception");
			//System.out.println("try");
			//Thread.sleep(10000);
		}
		catch(Exception e)
		{
			System.out.println("catch");
		}
		finally
		{
			System.out.println("finally");
			throw new Exception();
			
		}
	}

}
