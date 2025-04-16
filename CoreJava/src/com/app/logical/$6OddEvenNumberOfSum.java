package com.app.logical;
import java.util.Scanner;
public class $6OddEvenNumberOfSum
{

	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Number");
		int val=scan.nextInt();
		int oddSum=0;
		int evenSum=0;
		for(int i=0;i<=val;i++)
		{
			if(i%2==1)
			{
				oddSum=oddSum+i;
				System.out.println("odd Number is:"+i);
			}
			else 
			{
				evenSum+=i;
				System.out.println("Even number is:"+i);
			}
		}
		System.out.println("sum of odd:"+oddSum);
		System.out.println("Even Number of Sum:"+evenSum);
	}

}
