package com.app.arrays;

import java.util.Scanner;

public class PrintOddEven 
{
	public static void main(String[] args)
	{
	//int n=12;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Number");
		int n=scan.nextInt();
	for (int i=0;i<=n;i++)
	  {
		//System.out.println(i);
		if(n%2==0)
		{
			System.out.println("odd");
		}
		else
		{
			System.out.println("even");
		}
	  }
}
}
