package com.app.stringHandeling;
import java.util.Scanner;
public class Check17 
{

	public static void main(String[] args) 
	{
		
		Scanner scan=new Scanner(System.in);
        System.out.println("Enter the Character");
        String val=scan.nextLine();
        String[] arr=val.split(" ");
        String resultVal="";
        for(int i=arr.length-1;i>=0;i--)
        {
        	resultVal+=arr[i]+" ";
        }
        System.out.println(resultVal);
	}

}
