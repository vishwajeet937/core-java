package com.app.arrays;
import java.util.Scanner;
public class Check8
{
	public static void main(String[] args) 
	{
       Scanner scan = new Scanner(System.in);
       System.out.println("Enter the number");
       int num=scan.nextInt();
       for(int i=0;i<=num;i++) 
       {
    	   if(i%2==0)
    	   {
    		   System.out.println("Even number is:"+i);
    	   }
       }
       for(int i=0;i<=num;i++)
       {
          if(i%2==1)
	      {
		   System.out.println("Odd number is:"+i);
	      }
       }
	}
}
