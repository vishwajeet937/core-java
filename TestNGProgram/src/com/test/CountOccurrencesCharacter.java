package com.test;

import java.util.ArrayList;

public class CountOccurrencesCharacter 
{
  public static ArrayList count(String val)
  {
	  char[] ch=val.toCharArray();
	  int count = 0;
	  ArrayList<Character> al=new ArrayList<Character>();
	  for(int i=0;i<ch.length;i++)
	  {
		   if(ch[i]=='a')
		   {
			   count++;
			   al.add(ch[i]);
		   }
			   
	  }
	  if(count==0)
	  {
		  System.out.println("value concate is not available");
		  return null;
	  }
	  return al;
  }
}
