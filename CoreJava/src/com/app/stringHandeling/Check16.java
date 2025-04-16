package com.app.stringHandeling;
import java.util.Scanner;

public class Check16
{

	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Number");
		String name=scan.nextLine();
		//String name="Sonu";
		String name1=name.concat(" kumar");
		System.out.println("concate method: "+name1);
		

	}

}
