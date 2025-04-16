package com.app.nonStatic;
import java.util.Scanner;
public class Check9 
{
	{
		System.out.println("non-static");
	}
	public int add(int i,int j)
	{
		int i1=11;
		int j1=21;
		int add=(i1+j1);
		System.out.println("add:"+add);
		return 31; 
	}
	public String mult()
	{
		char ch='a';
		char ch1='b';
		int mult=(ch*ch1);
		System.out.println("mult of a value:"+mult);
		return "abc";
	}
	public void sub()
	{
		Scanner scan=new Scanner(System.in);
    	System.out.println("Enter of a value is:");
    	int i=scan.nextInt();
    	System.out.println("Enter of b value is:");
    	int j= scan.nextInt();
		//int i;
		//int j;
		int sub=(i-j);
		System.out.println("Result of SubValue is:"+sub);
		
	}
    public static void main(String[] args)
	{
    	
		Check9 c9=new Check9();
		c9.add(1,1);
		c9.mult();
		c9.sub();
	}

}
