package com.test;
import java.util.Scanner;

public class PatternProgram 
{
	@org.testng.annotations.Test
  public void Test()
  {
	  Scanner scan=new Scanner(System.in);
	  System.out.println("Enter The Number");
	  int num=scan.nextInt();
	  for (int i=1 ;i<=num ;i++)
	  {
		  for (int j=1 ;j<=i ;j++)
		  {
			  System.out.print(j+" ");
		  }
		  System.out.println();
	  }
  }
}
