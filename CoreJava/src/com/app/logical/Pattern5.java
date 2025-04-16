package com.app.logical;
import java.util.Scanner;
public class Pattern5 
{
	public static void main(String[] args)
	{
       Scanner scan=new Scanner(System.in);
       System.out.println("Enter the number");
       int pattern=scan.nextInt();
       for(int i=0;i<pattern;i++)
       {
    	  if(pattern%2==1)
    	   {
    		  System.out.print("mbb:"+i);
    	   }
       }
	}
}
