package com.app.exceptionalHandeling;

public class FlowInException1 
{
    public void flowInException()
    {
    	try
    	{
    		System.out.println("try");
    	}
    	finally
    	{
    		System.out.println("finally");
    	}
    	try
        { 
        	System.out.println("try1");
        }
        catch(Exception e)
        {
        	System.out.println("catch");
        }
    }
    public static void main(String[] args)
    {
    	FlowInException1 c=new FlowInException1();
    	c.flowInException();
    
    try
    { 
    	System.out.println("try1");
    }
    catch(Exception e)
    {
    	System.out.println("catch");
    }
  }
}

