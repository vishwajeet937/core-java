package com.app.patternProgram;
//
public class Pattern11 {

	public static void main(String[] args) 
	{
		int num=5;
		for(int row=1;row<=5;row++)
		{
			for(int space=1;space<=num-row+1;space++)
			{
				System.out.print(" ");
			}
			for(int col=1;col<=row;col++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
