package com.test;
import java.util.LinkedHashSet;
import java.util.Set;


public class ReverseString
{
   public static Set reverseString(String name)
   {
	   char[] arr=name.toCharArray();
	   Set<Character> s2=new LinkedHashSet<Character>();
	   for(int i = arr.length-1;i>=0;i--)
	   {
		   s2.add(arr[i]);
	   }
	   return s2;
   }
    
}
