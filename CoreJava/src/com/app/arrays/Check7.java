package com.app.arrays;
import java.util.Scanner;
public class Check7 
{
	public static void main(String[] args)
	{
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number");
        int num=scan.nextInt();
        for(int i=0;i<=num;i++)
        {
        	if(i%2!=0)
        	{
        		System.out.println("odd number is:"+i);
        	}
        	else if(i%2==0)
        	{
        		System.out.println("even Number is:"+i);
        	}
        }
	}
}
