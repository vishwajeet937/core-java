package com.app.patternProgram;
import java.util.Scanner;
public class pattern10
{

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=scan.nextInt();
		
		for(int row=1;row<=num;row++)
		{
			for(int space=1;space<=(num-row)*2;space++)
			{
				System.out.print(" ");
			}
			for(int col=1;col<=row*2;col++)
			{
				if(col%2==0)
				{
					System.out.print(0);
				}
				else
				{
					System.out.print(1);
				}
			}
			System.out.println();
		}
		/////////////////////////////////
		/*for(int row=1;row<=num;row++)
		{
			for(int space=1;space<=num-row;space++)
			{
				System.out.print(" ");
			}
			for(int col=1;col<=row;col++)
			{
				if(col%2==0)
				{
				System.out.print(0);
				}
				else
				{
					System.out.print(1);
				}
			}
			System.out.println();
		}*/

	}

}
