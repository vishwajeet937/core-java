package com.app.patternProgram;



public class SolidDiamond 
{
	public static void m1()
	{
		int n=4;
		for(int row=1;row<=n;row++)
		{
			for(int col=1;col<=n-row+1;col++)
			{
				System.out.print(" ");
			}
			for(int col=1;col<=row;col++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void m2()
	{
		int n=4;
		for(int row=1;row<=n;row++)
		{
			for(int col=1;col<=row;col++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void m3()
	{
		int n=4;
		for(int row=1;row<=n;row++)
		{
			for(int col=1;col<=row-1;col++)
			{
				System.out.print(" ");
			}
			for(int col=1;col<=n-row+1;col++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void m4()
	{
		int n=4;
		for(int row=1;row<=n;row++)
		{
			for(int col=1;col<=n-row+1;col++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) 
	{
		/*int n=4;
		for(int row=1;row<=n;row++)
		{
			for(int col=1;col<=n-row+1;col++)
			{
			System.out.print(" ");	
			}
			for(int col=1;col<=row;col++)
			{
				System.out.print("* ");
			}
			System.out.println();
			
		}*/
		m1();
		m2();
		m3();
		m4();

	}

}
