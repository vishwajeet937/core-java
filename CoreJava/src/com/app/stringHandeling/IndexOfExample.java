package com.app.stringHandeling;

public class IndexOfExample
{

	public static void main(String[] args) 
	{
		String s1="this is index of example";
		
		int index1=s1.indexOf("is");
		int index2=s1.indexOf("hi");
		int index3=s1.indexOf("example");
		System.out.println("index1: "+index1);
		System.out.println("index2: "+index2);
		System.out.println("index3: "+index3);
	}

}
