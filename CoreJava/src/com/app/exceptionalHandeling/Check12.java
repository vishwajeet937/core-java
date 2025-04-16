package com.app.exceptionalHandeling;
import java.util.Scanner;
public class Check12
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Number");
				
       try
       {
    	  System.out.println(2/0);  
       }
       catch(Exception e)
       {
    	   e.printStackTrace();
    	   System.out.println("sd");
       }
	}
}
