package com.app.project;
import java.util.Scanner;
public class Calculator
{
	static Scanner scan=new Scanner(System.in);
    int enterNumber;	
	//int enterNumber1=scan.nextInt();
	
	static
	{
		System.out.println("************Welcome to Calculator************");
		System.out.println("Enter 1st num is add ");
		System.out.println("Enter 2nd num is sub");
		System.out.println("Enter 3rd num is Devision");
		System.out.println("Enter 4th num is Multiplication");
		System.out.println("Enter 5th num is Persentage");
	}
// Addation,subtraction,Devision  Logic
	public void add(int i,int j)
	{
		System.out.println("Enter 1St number");
		int num1=scan.nextInt();
		System.out.println("Enter 2nd number");
		int num2=scan.nextInt();
		//int num3=scan.nextInt();
		int add3;
		//int sub;
		if(enterNumber==1)
		{
			add3=num1+num2;
			//add3=num1+num2+num3;
			System.out.println("Result of Addation:"+add3);
		}
		else if(enterNumber==2)
		 {
			int sub=num1-num2;
			System.out.println("Result of Sub:"+sub);
		 }
		else if(enterNumber==3)
		{
			int dev=num1/num2;
			System.out.println(" Result of Dev:"+dev);
		}
	}
	
//Multiplication Logic	
	public int[] multiplication(int[] arr)
	 {
		
		System.out.println("Enter the 1st number");
		int num1=scan.nextInt();
		System.out.println("Enter the 2nd number");
		int num2=scan.nextInt();
		 if(enterNumber==4)
		{
			int mul=num1*num2;
			System.out.println("Result of multiplication:"+mul);
		}
		return new int[] {};
	 }
	
//Persenteg Logic
	
	public Object persentage()
	 {
		System.out.println("Enter the 1st number of persentage");
		int num1=scan.nextInt();
		System.out.println("Enter the 2nd number of persentage");
		int num2=scan.nextInt();
		
		if(enterNumber==5)
		{
			int per=num1%num2;
			System.out.println("Result of Persentage:"+per);
		}
		return new Calculator();
	 }
	public static void main(String[] args) 
	{
		Calculator c=new Calculator();
		Scanner scan=new Scanner(System.in);
		int enterNumber=scan.nextInt();
		c.enterNumber=enterNumber;
		System.out.println("Enter Chose number");
		int enterNumber1=scan.nextInt();
		
		
		try
		{
			
			if(enterNumber1==4)
			{
			c.multiplication(new int[] {});
			}
			else if(enterNumber1==2||enterNumber1==1)
			{
				c.add(12,13);
			}
			else
			{
				if(enterNumber1==5)
				{
				c.persentage();
				}
			}
			
		}
		 catch (Exception e)
		{
			if(enterNumber1==3)
			{
			 c.add(12,13);
			}
			else
			{
				System.out.println("else");
			}
			 
			 
			/* try
			 {
				 if(enterNumber1==5)
				 {
					 c.persentage();
				 }
				 else
				 {
					 throw new Exception();
				 }
			 }
			 finally
			 {
				 e.printStackTrace();
				 System.out.println("wjkhfjk");
			 }*/
		}
		
		
	}

}
