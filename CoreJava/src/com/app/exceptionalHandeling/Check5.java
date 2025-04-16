package com.app.exceptionalHandeling;

public class Check5 
{
	int i=23;
	int j=0;
	public void m1()
	{
       try
        {
    	  //System.out.println("try");
    	   System.out.println(i/j);
        }
       catch(NullPointerException e)
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
		Check5 c=new Check5();
		c.m1();
	}
}
