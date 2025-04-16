package com.app.exceptionalHandeling;
import java.util.Scanner;
public class CustomeException1 
{
   /* public static void patna(String s)throws Exception
    {
    try 
      {
    	if(s=="Patna")
    	{
    	   System.out.println("true");	
    	}
    	else if(s=="mahadeopur")
    	{
    		System.out.println("ye v sahi h");
    	}
    	else
    	{
    		System.out.println("glat h");
    		throw new Exception();
    	}
      }
      catch(Exception e)
       {
         	e.printStackTrace();
       }
    }
    public static void valid(int age)
    {
    try
  	 {
    		if(age<18)
    		{
    		System.out.println("valied age for Boy");
    	 }
    	else if(age==18||age<=56)
    	{
    		System.out.println("valied age for man");
    	}
    	else
    	{
    		System.out.println("invelied age");
    	}
    }
    	catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    }
	public static void main(String[] args)throws Exception
	{
		
		try
		{
		  CustomeException1.patna("Patna");
		  throw new Exception();
		}
		catch(Exception e)
		{
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter the Number in age");
			int val=scan.nextInt();
			 CustomeException1.valid(val);
		}
	}*/
	public static void main(String args[])
	{
		int a=2;
		int b=3;
		int c=4;
		int avg=a+b+c/3;
		System.out.println(avg);
	}

}
