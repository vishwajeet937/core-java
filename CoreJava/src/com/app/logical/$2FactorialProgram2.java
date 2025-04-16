package com.app.logical;
import java.util.Scanner;
public class $2FactorialProgram2
{

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number");
		int fact=scan.nextInt();
		int factNum=1;
		for(int i=1;i<=fact;i++)
		{
			factNum*=i;
		}
		System.out.println(factNum);
	}

}
