package com.test;
import java.util.Scanner;
public class PatternProgram1 
{
	@org.testng.annotations.Test
public void pattern()
{
Scanner scan=new Scanner(System.in);
System.out.println("Enter the Number");
int num=scan.nextInt();
for (int i=1 ;i<=num ;i++)
{
  for(int j=num ;j>=i ;j--)
  {
	  System.out.print(j+" ");
  }
  System.out.println();
}
}
}
