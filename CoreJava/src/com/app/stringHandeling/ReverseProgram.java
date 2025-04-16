package com.app.stringHandeling;
import java.util.Scanner;
public class ReverseProgram 
{

	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number");
         String name=scan.nextLine();
		//String name="how are you?";        without Scanner keyword use
         String[] arr=name.split(" ");
         String result="";
         for(int i=arr.length-1;i>=0;i--)
         {
        	result+=arr[i]+" "; 
         }
         System.out.println(result);
	}

}
