package com.app.stringHandeling;

public class Check7 
{
public static void main(String[] args)
{
	String s1="nfbgfhdhbvf";
	String s2="dbfjbf";
	String s="dsfsf_sdfsdf_dfsf_dsfsdf_dsfdsf_dsfs_dsfds";
	String s3=s1.concat(s2);
	System.out.println(s3);
	
	boolean s4=s1.endsWith("f");
	System.out.println(s4);
	
	boolean s5=s2.startsWith("d");
	System.out.println(s5);
	
	int s6=s1.length();
	System.out.println(s6);
	
	int s7=s1.indexOf('v');
	System.out.println(s7);
	
	char s8=s2.charAt(4);
	System.out.println(s8);
	
	boolean s9=s2.contains("dbf");
	System.out.println(s9);
	
	System.out.println(s1.isEmpty());
	
	int s11=s1.lastIndexOf('f');
	System.out.println(s11);
	
	String[] s12=s.split("//");
	System.out.println(s);
	
	System.out.println(s1.concat(s2));
}
}
