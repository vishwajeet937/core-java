package com.app.project;
import java.util.Scanner;
public class CalculatorPro
{
  static
  {
	  System.out.println("***************Welcome to CalculatorPro****************");
	  System.out.println("Enter 1st number is Addation");
	  System.out.println("Enter 2nd number is Subtraction");
	  System.out.println("Enter 3rd number is Multiplication");
	  System.out.println("Enter 4th number is Devision");
	  System.out.println("Enter 5th number is Persentage");
  }
	public static void main(String[] args)
	{
		int add,sub,mul,dev,per;
		//System.out.println("Enter the number");
		Scanner scan=new Scanner(System.in);
		System.out.println("Select number");
		int cal=scan.nextInt();
		System.out.println("Enter the FirstNumber");
		int num1=scan.nextInt();
		System.out.println("Enter the SecondNumber");
		int num2=scan.nextInt();
		
		
		if(cal==1)
		{
			add=num1+num2;
			System.out.println("Result is Addition:"+add);
		}
		else if(cal==2)
		{
			sub=num1-num2;
			System.out.println("Result is Subtriction:"+sub);
		}
		else if(cal==3)
		{
			mul=num1*num2;
			System.out.println("Result is Multiplication:"+mul);
		}
		else if(cal==4)
		{
			dev=num1-num2;
			System.out.println("Result is Devision:"+dev);
		}
		else if(cal==5)
		{
			per=num1*num2/100;
			System.out.println("Result is Persentage:"+per);
		}
		

	}

}
