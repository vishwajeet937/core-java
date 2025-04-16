package com.app.patternProgram;
import java.util.Scanner;
public class SandglassStarPattern
{

	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=scan.nextInt();
		
		for (int row=1;row<=num;row++)
		 {
			for(int space=1;space<=row-1;space++)
			 {
				System.out.print(" ");
			 }
			for(int col=1;col<=num-row+1;col++)
			 {
				System.out.print("* ");
			 }
			System.out.println();
		 }
		/////////////////////////////////////
		for(int row=1;row<=num;row++)
		 {
			for(int space=1;space<=num-row;space++)
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
