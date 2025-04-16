package com.app.logical;

import java.util.Scanner;

public class Demo
{
	public static void main(String[] args)
	{
  Scanner scan=new Scanner(System.in);
  System.out.println("Enter the first value");
  int a=scan.nextInt();
  int i=a;
  Scanner scan1=new Scanner(System.in);
  System.out.println("Enter the second value");
  int b=scan1.nextInt();
  //int m=j;
  for (i=a;i<=b;i++)
    {
	  if(i%2==0)
	  {
	  System.out.print(i);
      }
	  else {
	  System.out.println();
	  }
    }
  //System.out.println();
  }
}
