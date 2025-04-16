package com.test;

import java.util.ArrayList;

public class PalindromeNumber
{
   public static ArrayList palindrome1(int[] arr)
   {
	   ArrayList<Integer> al=new ArrayList<Integer>();
	  for(int i=arr.length-1;i>=0;i--)
	  {
		  al.add(arr[i]);
	  }
	   
	   return al;
   }
}
