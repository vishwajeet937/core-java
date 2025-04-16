package com.test;
import java.util.Arrays;
import java.util.Scanner;

public class Test8 
{
	@org.testng.annotations.Test
   public void patternTest()
   {
	   Scanner scan=new Scanner(System.in);
	   System.out.println("Enter the number");
	   int val=scan.nextInt();
	   int[] arr=new int[val];
	   for (int i=1 ;i<=val ;i++)
	   {
		   for (int j=1 ;j<=i ;j++)
		   {
			   System.out.print("*"+" ");
		   }
		   System.out.println();
	   }
    }
	@org.testng.annotations.Test
	public void add()
	{
		int i=101;
		int j=202;
		int sum=(i+j);
		System.out.println(sum);
	}
	@org.testng.annotations.Test
	public void ExceptionProgram()
	{
		try 
		{
			System.out.println("try");
			throw new Exception("Throw");
			 
		}
		catch(Exception n)
		{
			System.out.println("catch");
		}
		finally
		{
			System.out.println("finally");
		}
	}
}
