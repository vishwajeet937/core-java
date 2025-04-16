package com.app.exceptionalHandeling;

public class FlowInException 
{
    public void check2()
    {
    	try
    	{
    		System.out.println("try");
    	}
    	catch(Exception e)
    	{
    		  System.out.println("catch");
    	}
    	finally
    	{
    		System.out.println("finally");
    	}
    }
 public static void main(String[] args)
 {
	 FlowInException c=new FlowInException();
	 c.check2();
	 ArithmeticException c1=new ArithmeticException();
	 //c1.check1();
 }
}
