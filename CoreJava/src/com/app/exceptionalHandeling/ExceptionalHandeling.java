package com.app.exceptionalHandeling;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner; 
public class ExceptionalHandeling 
{
	public void m()
	{
		Scanner scan=new Scanner(System.in);
		int i1=scan.nextInt();
		int j1[]=new int[i1];
	}
	public void m1()throws Exception
	{
		int i=10;
		int j=10;
		int add;
		add=(i+j);
		System.out.println(add);
		try(FileWriter f=new FileWriter("dfs") )
		{
			add=(i/j);	
		}
		catch(Exception e)
		{
			e.printStackTrace();
			//System.out.println("Arthematic ");
		}
		finally
		{
			System.out.println("finally");
		}
	}
	
	public static void main(String[] args)throws Exception
	{
       System.out.println("Hello world");
       ExceptionalHandeling c=new ExceptionalHandeling();
       c.m1();
	}
}
