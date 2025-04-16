package com.app.logical;

public class $5ReverseString1 
{

	public static void main(String[] args)
	{
		String name="my name is Sonu kumar ";
		String[] arr=name.split(" ");
		String res="";
		for(int i=arr.length-1;i>=0;i--)
		{
			res+=arr[i]+" ";
			
		}
		System.out.println(res);
	}

}
