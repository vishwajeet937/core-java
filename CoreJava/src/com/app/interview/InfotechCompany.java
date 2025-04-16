package com.app.interview;

public class InfotechCompany
{
public int m1()
 {
   try
   {
	   System.out.println("vgh");
    throw new NullPointerException(); 
		   //return 1;
	   //System.exit(2);
	  // return 2;
   
    }
    finally
  {
	System.out.println("finally");
  }
   
 }
	public static void main(String[] args) 
	{
		InfotechCompany i=new InfotechCompany();
		i.m1();

	}

}
