package com.app.stringHandeling;

public class Durga2
{

	public static void main(String[] args) 
	{
		System.out.println("=====String=====");
	String s1=new String("durga");
	String s2=new String("durga");
	System.out.println(s1==s2);
	System.out.println(s1.equals(s2));
	
	System.out.println("=====StringBuffer=====");
	StringBuffer sb1=new StringBuffer("Durga");
	StringBuffer sb2=new StringBuffer("Durga");
	System.out.println(s1==s2);
	System.out.println(s1.equals(sb2));

	}

}
