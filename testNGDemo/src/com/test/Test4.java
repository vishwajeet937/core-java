package com.test;
import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;
public class Test4 
{
	@Test
	public void Test()
	{
		try
		{
			int i=121;
			int j=0;
			int dev;
			dev=(i/j);
			System.out.println(dev);
		}
		catch(Exception e)
		{
			System.out.println("catch");
		}
	}
	@Test
	public void Test01()
	{
		
		{
			System.out.println("Non-static block");
		}
	}

}
