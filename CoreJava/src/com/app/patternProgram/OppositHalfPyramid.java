package com.app.patternProgram;

public class OppositHalfPyramid 
{

	public static void main(String[] args) 
	{
		int n=4;
		for(int row=1;row<=n;row++)
		{
			for(int col=1;col<=n-row;col++)
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

}
