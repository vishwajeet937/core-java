package com.app.nonStatic;
import java.util.Scanner;
public class Check8
{
	{
		System.out.println("non- static");
	}
	public int oddNumber(int arr[])
	{
		int num1=10;
		for(int i=0;i<=num1;i++)
		{
			System.out.println("odd Number is:"+i);
		}
		return 11;
	}
	//static
	static 
	{
		System.out.println("static");
	}
	{
		System.out.println("2-nd non static");
	}
	public static void evenNumber(int num)
     {
		for(int i=0;i<=num;i++)
		{
			System.out.println("evenNumber is:"+i);
		}
     }
	static
	{
		System.out.println("2-nd static");
	}
	public String name()
	{
		System.out.println("my name is sonu kr");
		return "name";
	}
	public static Check8 m1()
	{
		System.out.println("class type");
		return new Check8();
	}
    public static void main(String[] args)
	{
	   Scanner scan=new Scanner(System.in);
	   System.out.println("Engter the number");
	   int num=scan.nextInt();
		Check8 c8=new Check8();
		c8.oddNumber(null);
		c8.evenNumber(num);
		c8.name();
		m1();
	}
}
