package com.app.stringHandeling;

public class Check12 
{

	public static void main(String[] args) 
	{
		String name="vishwajeet";
		
		System.out.println(name);
		System.out.println(name.concat("kumar"));
		System.out.println(name.toUpperCase());
		name=name.concat("nit");
		System.out.println(name.toLowerCase());
		
		
		char[] ch= {'h','a','r','i'};
		ch[1]='a';
		System.out.println("ch:"+ch);
		System.out.println(ch);
		
		StringBuffer sb=new StringBuffer("sonu");
		System.out.println("sb:"+sb);
		
		StringBuffer sb1=new StringBuffer("sonu");
		System.out.println("sb1:"+sb1);
		
		System.out.println(name.isEmpty()+" "+"empty");
		System.out.println(name.length());
		
		
		String s1="a";
		String s2="a";
		System.out.println(s1==s2);
		
		String s3=new String("a");
		System.out.println(s1==s3);
		System.out.println(s2==s3);
		
		String s4=new String("b");
		System.out.println(s3==s4);
		
		String s5=new String("b");
		System.out.println(s4==s5);
		
		char ch1[]= {'a','b','c','d'};
		String s=new String(ch1);
		System.out.println(s);
	}

}
