package com.app.defaultProgram;

import java.util.Scanner;

public class OddEven 
{

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Number");
		int val=scan.nextInt();
		for(int i=0;i<val;i++)
		{
			if(i%2==1)
			{
				System.out.println("Odd Naumber is:"+i);
			}
			else
			{
				System.out.println("Even Number is:"+i);
			}
		}
		
	}

}
