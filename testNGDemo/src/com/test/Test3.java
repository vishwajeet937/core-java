package com.test;
import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;
public class Test3 
{
	@Test
    public void Test()
    {
    	int i=100;
    	int j=101;
    	System.out.println(i+j);
    }
    @Test
    public void Test01()
    {
    	int i1=12;
    	int j1=0;
    	try
    	{
    	    System.out.println(i1*j1);	
    	}
    	catch(Exception e)
    	{
    	   System.out.println("catch");	
    	}
    }
}
