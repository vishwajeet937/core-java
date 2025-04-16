package com.app.logical;
import java.util.Scanner;
public class $3OddEven1 
{

	public static void main(String[] args)
	{
       Scanner scan=new Scanner(System.in);
       System.out.println("Enter the Number");
       int num=scan.nextInt();
       for(int i=0;i<=num;i++)
       {
    	   if(i%2==0)
    	   {
    		   System.out.println("Evennumber is:"+i);
    	   }
       }
       System.out.println("Odd Number Print");
       for(int i=0;i<=num;i++)
       {
    	   if(i%2==1)
    	   {
    		   System.out.println("OddNumber is:"+i);
    	   }
       }
	}

}
