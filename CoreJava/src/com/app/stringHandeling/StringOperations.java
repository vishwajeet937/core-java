package com.app.stringHandeling;

public class StringOperations 
{

	public static void main(String[] args) 
	{
		String s="java Programming Language";
		String e="";
		//finding String is empty or not
		System.out.println("Empty method is:"+s.isEmpty());
		System.out.println("Empty method e is:"+e.isEmpty());
		
		//finding length of String
		System.out.println(s.length());
		
		String s1="";
		String s2=" ";
		String s3=new String("");
		
		System.out.println("Empty s1 is:"+s1.isEmpty());
		System.out.println("Empty s2 is:"+s2.isEmpty());
		System.out.println("Empty s3 is:"+s3.isEmpty());
		
		System.out.println("length s1 is:"+s1.length());
		System.out.println("length s2 is:"+s2.length());
		System.out.println("length s2 is:"+s3.length());
		
		//printing string object
		System.out.println(s);
		
		//comparing two string
		String s10=new String("abc");
		String s20=new String("abc");
		String s30=new String("Abc");
		
		System.out.println(s10==s20);
		System.out.println(s10.equals(s20));
		
		System.out.println(s20==s30);
		System.out.println(s20.equals(s30));
		
		
		//comparing strings without case,below method is defined in String class
		//public boolean equalslgnoreCase(String s)
         
		String s4=new String("a");
		String s5=new String("A");
		System.out.println(s4.equals(s5));
		System.out.println(s4.equalsIgnoreCase(s5));
		
		//comparing string lexicographically,means after comparison method should return diff
		//b/w string content
		
		//public int compareTo(String s)
		//public int compareToIgnoreCase(String s)
		
		String s6=new String("a");
		String s7=new String("A");
		System.out.println("compare is:"+s6.compareTo(s7));
		System.out.println(s6.compareToIgnoreCase(s7));
		
		String s8="abcdef";
		String s9="abc";
		System.out.println(s8.compareTo(s9));
		
		String s110="abcdef";
		System.out.println(s9.compareTo(s110));
		
		String s11="adc";
		System.out.println(s11.compareTo(s9));
		
		//startsWith()/endWith()
		String s12="java programing language";
		System.out.println(s12.startsWith("java"));
		System.out.println(s12.startsWith("Java"));
		System.out.println(s12.startsWith("Hari"));
		
		System.out.println(s12.endsWith("language"));
		System.out.println(s2.endsWith("programing"));
		System.out.println(s12.endsWith("Hari"));
	}

}
