package com.app.patternProgram;
import java.util.Scanner;
public class TriangleStarPattern
{

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number");
        int num=scan.nextInt();
        
        for(int row=1;row<=num;row++)
         {
        	for(int space=1;space<=row;space++)
        	{
        		System.out.println("*");
        	}
         }
	}

}
