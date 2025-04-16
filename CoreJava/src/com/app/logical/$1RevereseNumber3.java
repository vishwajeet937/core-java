package com.app.logical;
import java.util.Scanner;
public class $1RevereseNumber3 
{

	public static void main(String[] args) 
	{
        Scanner scan=new Scanner(System.in);		
        System.out.println("Enter the number");
         int revNum=scan.nextInt();
         for(int i=revNum;i>=0;i--)
         {
        	 System.out.println(i);
         }
	}

}
