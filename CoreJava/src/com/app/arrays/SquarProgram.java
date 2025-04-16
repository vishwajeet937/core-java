package com.app.arrays;
import java.util.Scanner;
public class SquarProgram
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=scan.nextInt();
     //  int num=21;    //HardCoder
       for (int i=0; i<=num; i++)
       {
    	   System.out.println(i*i);
       }
	}
}
