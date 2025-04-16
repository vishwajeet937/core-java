package com.test;

import java.util.LinkedHashSet;
import java.util.Set;

public class FindFirstRepetedCharacter 
{
   public static Set nonRepted(String name)
   {
	   char[] ch=name.toCharArray();
	   Set<Character> s=new LinkedHashSet<Character>();
	   for(int i=0;i<name.length();i++)
	   {
		   s.add(ch[i]);
	   }
	   return s;
   }
}
