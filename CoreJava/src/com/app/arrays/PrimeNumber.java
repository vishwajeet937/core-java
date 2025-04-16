package com.app.arrays;
import java.util.Scanner;
public class PrimeNumber
{

	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number");
	     int num=scan.nextInt();
	     
	     for(int i=0;i<=num;i++)
	     {
	    	 if(i%2==1)
	    	 {
	    		 System.out.println("prime number:"+i);
	    	 }
	    	 else
	    	 {
	    		 System.out.println("not prime");
	    	 }
	     }

	}

}
