package com.app.logical;
//import java.util.Scanner;
import java.util.*;
public class Calculator
{

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the firstNumber");
		int no1=scan.nextInt();
		System.out.println("Enter the SecondNumber");
		int no2=scan.nextInt();
		System.out.println("Select symbol (+,-,*,/)");
		String sym=scan.next();
		int result;
		
		switch(sym)
		{
		case "+":
			result=no1+no2;
			System.out.println("Addation is:"+result);
			break;
		case "*":
			result=no1+no2;
			System.out.println("multi is:"+result);
			break;
		}
		
	}

}
