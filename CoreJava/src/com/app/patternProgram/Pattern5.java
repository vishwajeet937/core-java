package com.app.patternProgram;

public class Pattern5 
{

	public static void main(String[] args)
	{
	 int n=16;
	 for(int row=1;row<=n;row++)
	 {
		 if(row==1||row==16)
		 {
			 for(int col=1;col<=n-row+1;col++)
			 {
				 System.out.print("*");
			 }
		 }
		 else
		 {
			 System.out.print("*");
			 for(int space=1;space<=n-row-1;space++)
			 {
				 System.out.print(" ");
			 }
			 System.out.print("*");
		 }
		 System.out.println();
	 }

	}

}
