package com.app.exceptionalHandeling;

public class Check7
{
    int i=23;
    int j=0;
    public void m1()throws Exception
    {
    	try
    	{
    		throw new Exception();
    		//System.out.println(i+j);
    	}
    	catch(Exception e)
    	{
    		System.out.println("catch");
    	}
    }
    public static void main(String[] args)throws Exception
      {
    	Check7 c=new Check7(); 
    	c.m1();
      }
}
