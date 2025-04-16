package com.app.arrays;
import java.util.Scanner;
public class VVV 
{

	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the mobNo");
		float mobNo=scan.nextFloat();
		System.out.println(mobNo);
		
		Scanner scan1=new Scanner(System.in);
		System.out.println("enter the Balance");
		float bal=scan.nextFloat(); 
		System.out.println(bal);
		
		float total=mobNo+bal;
		System.out.println(total);
	    
	}

}
