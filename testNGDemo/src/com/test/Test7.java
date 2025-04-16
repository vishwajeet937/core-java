package com.test;
import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;

public class Test7 
{
	@Test
  public void  test()
    {
		System.out.println("Test");
    }
	
	 class Check extends Test7
	 {
		  @Test
	  	public void m1()
	  	{
	  		System.out.println("m1");
	  	}
	  }
	  class Check1 extends Check
	  {
		  @Test
	  	public void m2()
	  	{
	  		System.out.println("m2");
	  	}
	  	/*public static void main(String[] args) 
	  	{
	  		Check c=new Check();
	  		c.m2();
	  	}*/
	  }

    }

