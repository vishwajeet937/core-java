package com.app.stringHandeling;

public class Pattern 
{

	public static void main(String[] args)
	{
		int num=4;
		
		for(int row=1;row<=num;row++)
		{
			
				for(int space=1;space<=num+row-1;space++)
				{
					System.out.print(" ");
				}
				for(int col=1;col<=row-1;col++)
				{
				System.out.print("* ");
			    }
				System.out.println();
		}
	}

}
