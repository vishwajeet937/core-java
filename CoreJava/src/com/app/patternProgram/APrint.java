package com.app.patternProgram;
import java.util.Scanner;
public class APrint
{

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=scan.nextInt();
		
		for(int row=0;row<=num;row++)
		 {
			for(int col=0;col<=num/2;col++)
			{
				if((col==0||col==num/2) && row!=0||
						row==0 && col!=num/2 ||
						row==num/2)
				{
					System.out.print("*");
				}
				else
				{ 
					System.out.print(" ");
				}
				
			}
			System.out.println();
		 }
	}

}

