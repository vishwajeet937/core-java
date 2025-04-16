package com.test;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Check

{
	@Parameters({"rangeName"})
	@Test
  public static void m1(@Optional("9")int range)
  {
	  for(int i=0;i<range;i++)
	  {
		  if(i%2!=0)
		  {
			  System.out.println(i);
		  }
	  }
  }
	@Parameters({"rangeNum"})
	@Test
	public void m2(@Optional("23")int num)
	{
		for(int i=0;i<num;i++)
		{
			if(i%2==0)
			{
			System.out.println(i);	
			}
		}
	}
	@Parameters({"sName"})
	@Test
	public static void m3(@Optional("sonu")String name)
	{
		char[] arr=name.toCharArray();
		for(int i = name.length()-1;i>=0;i--)
		{
			System.out.println(arr[i]);
		}
	}
}
