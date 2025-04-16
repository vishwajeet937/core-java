package com.test;
import java.util.Set;
import java.util.LinkedHashSet;
public class RemoveDuplicateCharacterProgram 
{
   public static Set duplicate(String name)
   {
	   char[] arr=name.toCharArray();
	   Set<Character> s=new LinkedHashSet<Character>();
	   for (int i=0;i<arr.length;i++)
	   {
		   s.add(arr[i]);
	   }
	   return s;
   }
}
