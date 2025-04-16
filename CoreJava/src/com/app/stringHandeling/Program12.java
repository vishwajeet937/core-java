package com.app.stringHandeling;

import java.util.ArrayList;
import java.util.Scanner;

public class Program12
{
	static
	{
		System.out.println("*******static***********");
		try
		{
		Thread.sleep(10000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		//tream method
		String name=new String("vishwajeet kumar");
		String name1=name.trim();
		System.out.println(name);
		System.out.println(name1);
		System.out.println(name==name1);
		try
		{
			Thread.sleep(10000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	{
		System.out.println("*********non static**********");
		try
		{
			Thread.sleep(10000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		//reverse string
		String name="i'm vishwajeet kumar";
		String[] revName=name.split(" ");
		String result="";
		for(int i=revName.length-1;i>0;i--)
		{
			result+=revName[i]+" ";
		}
		System.out.println(result);
	}
	Program12()
	{
		this(11);
		System.out.println("******constructor********");
		ArrayList al=new ArrayList();
		al.add(1);
		al.add("s");
		al.add(2);
		for(Object obj:al)
		{
			System.out.println(obj);
		}
	}
	static
	{
		System.out.println("*********static 1***********");
	    ArrayList<Integer>al1=new ArrayList();
	   al1.add(3);
	   al1.add(4);
	    for(int i:al1)
	    {
	    	System.out.println(i);
	    }
	}
	{
		System.out.println("****Non static 1*******");
		ArrayList<String> al=new ArrayList();
		al.add("sonu");
		al.add("Kumar");
		al.add("Vishwajeet");
		//for each loop
		for(String s:al)
		{
			System.out.println(s);
		}
	}
	Program12(int i)
	{
		System.out.println("****one parrem constructor*******");
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Number");
		int i1=scan.nextInt();
		int[] arr=new int[i1];
		for(int j=0;j<=arr.length-1;j++)
		{
			if(j%2==0)
			{
				System.out.println("Print Even Number is:"+j);
			}
		}
	}
	static
	{
		System.out.println("********* static 2********");
		
	}
	public static void main(String[] args)
	{
		Program12 p=new Program12();
    
    		 
	}

}
