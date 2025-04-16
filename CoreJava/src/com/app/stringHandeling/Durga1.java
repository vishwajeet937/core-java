package com.app.stringHandeling;

public class Durga1 
{

	public static void main(String[] args) 
	{
       String s=new String("Durga");
       s.concat("Shoftware");
       System.out.println("concate of s:"+s);
       System.out.println("concate is wrong");
       
       StringBuffer sb=new StringBuffer("Durga");
       sb.append("shoftWare");
       System.out.println("append of sb:"+sb);
       System.out.println("append is wright");
       
	}

}
