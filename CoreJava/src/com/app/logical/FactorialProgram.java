package com.app.logical;
import java.util.Scanner;
public class FactorialProgram 
{

	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number");
        int val=scan.nextInt();
        int fact=1;
        for(int i=1;i<=val;i++)
        {
        	fact=fact*i;
        }
        System.out.println(fact);
	}

}
