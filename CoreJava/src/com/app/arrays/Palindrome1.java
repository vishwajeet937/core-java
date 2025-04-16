package com.app.arrays;

public class Palindrome1 
{

	public static void main(String[] args)
	{
		String str="malayalam";
		String revrseStr="";
		
		int strLength=str.length();
		int srtLength = 1;
		for(int i=(srtLength-1);i>=0;i--)
		{
			revrseStr=revrseStr+str.charAt(i);
			System.out.println(revrseStr);
		}
		if(str.toLowerCase().equals(revrseStr.toLowerCase()))
		{
			System.out.println(str+"palindrome String");
		}
		else
		{
			System.out.println(str+"not palindrome String");
		}

	}

}
