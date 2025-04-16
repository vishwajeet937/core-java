package com.app.stringHandeling;
import java.util.Scanner;
public class WorldReverseProgram 
{

	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter String");
		String str=scan.nextLine();
		//String name="How are you";
		String[] stringWords=str.split(" ");
		String resultString="";
		for(int i=stringWords.length-1;i>=0;i--)
		{
			resultString+=stringWords[i]+" ";
			//resultString=resultString+stringWords[i]+" ";
		}
            System.out.println(resultString);
	}

}
