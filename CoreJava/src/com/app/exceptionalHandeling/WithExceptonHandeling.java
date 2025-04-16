package com.app.exceptionalHandeling;

public class WithExceptonHandeling 
{
    void m1()
    {
    	System.out.println("1");
    	try 
    	{ 
    		System.out.println("2");
    		int x=10/0;
    		System.out.println("3");
    	}
    	catch(Exception e)
    	{
    		System.out.println("4");
    	}
    	System.out.println("5");
    }
	public static void main(String[] args)
	{
		WithExceptonHandeling wex=new WithExceptonHandeling();
		wex.m1();

	}

}
