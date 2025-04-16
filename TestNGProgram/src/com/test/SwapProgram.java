package com.test;

import java.util.ArrayList;

public class SwapProgram 
{
	public static ArrayList swap(String s1,String s2)
	{
		ArrayList list=new ArrayList(); 
			s1=s1+s2;
			s2=s1.substring(0,s1.length()-s2.length());
			s1=s1.substring(s2.length());
			list.add(s1);
			list.add(s2);
			return list;
			
	}
		
}
