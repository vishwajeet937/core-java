package com.app.patternProgram;
import java.util.Scanner;
public class LeftPascalTriangle
{

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=scan.nextInt();
		
		 for(int row=1;row<=num;row++)
		  {
			 for(int space=1;space<=num-row;space++)
			  {
				 System.out.print(" ");
			  }
			 for(int col=1;col<=row;col++)
			 {
				 System.out.print("*");
			 }
			 System.out.println();
		  }
		 ////////////////////////
		 for(int row=1;row<=num;row++)
		  {
			 for(int space=1;space<=row;space++)
			  {
				 System.out.print(" ");
			  }
			 for(int col=1;col<=num-row;col++)
			  {
				 System.out.print("*");
			  }
			 System.out.println();
		  }
	}

}
