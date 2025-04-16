package com.test;

import java.util.ArrayList;

public class SmallestLargest 
{
   public static int smallest(int arr[])
   {
	   //int arr[]=new int[]{123,435,67,2,65,342,46};
	   int smallest=arr[0];
	   for(int i=0 ;i<arr.length ;i++)
	   {
		   if (arr[i]<smallest)
		   {
			   smallest=arr[i];
		   } 
	   }
	  
	  return smallest; 
   }
   public static int largest(int arr[])
   {
	   int largest=arr[0];
	   for(int j=0 ;j<arr.length ;j++)
	   {
	      
	      if(arr[j]>largest)
	         {
		   largest=arr[j];
	         }
	   }
	   return largest;
   }
  /* public static void main(String args[])
   {
	  
	
	    int smallest=0;
	    smallest=SmallestLargest.smallest(new int[]{1,2,3,4,5});
	    int largest=0;
	   largest=SmallestLargest.largest(new int[]{6,7,8,9});
	   System.out.println(smallest);
	   System.out.println(largest);
   }*/
   public static int odd(int arr[])
   {
	   int odd=arr[0];
	   for (int i=0;i<arr.length;i++)
	   {
		   if(arr[i]%2==1)
		   {
			   odd=arr[i];
		   }
	   }
	   return odd;
   }
  /* public static int palindrome(int num)
   {
	   int num=121;
	   int palindrome=arr[0];
	   for (int i=arr.length-1;i>=0;i++)
	   {
		   num=num
	   }
   }*/
   public static int linearSearch(int arr[])
   {
	   int numberSearch=23;
     		for (int i=0 ;i<arr.length ;i++ )
 		{
 			if (arr[i]==numberSearch)
 			{
 				numberSearch=arr[i];
 			}
 		}
     		return numberSearch;
 	}
   /*public static String reverse(String name)
   {
	   String name="vishwajeet kumar";
		int length=name.length();
		String rev=" ";
		for (int i=length-1 ;i>=0 ;i-- )
		{
			rev=rev+name.charAt(i);
		}
		return name;
   }*/
   public static int even(int arr[])
   {
	   int evenVal=arr[0];
	   for (int i=0;i<arr.length;i++)
	   {
		   evenVal=arr[i];
	   }
	   return evenVal;
   }
   public static int factorial(int arr[])
	{
	   int n=1;
		int fact=1;
		for (int i=1 ;i<=n ;i++)
		{
			fact=fact*i;
		}
		return n;
	}
  public static ArrayList vowel(String name)
  {
	 // String name="qeqeqsa";
	  char[] arr=name.toCharArray();
	 // char vowelAdd=arr[0];
	  ArrayList<Character> vowelAl=new ArrayList<Character>();
	  for(int i=0;i<arr.length;i++)
	  {
		  if(arr[i]=='a'||arr[i]=='e'||arr[i]=='i'||arr[i]=='o'||arr[i]=='u')
		  {
			 vowelAl.add(arr[i]); 
		  }
	  }
	  return vowelAl;
  }
  public static ArrayList consonent(String name)
  {
	  char[] arr=name.toCharArray();
	  ArrayList<Character> consAl=new ArrayList<Character>();
	  for (int i=0;i<arr.length;i++)
	  {
		 if(!(arr[i]=='a'||arr[i]=='e'||arr[i]=='i'||arr[i]=='o'||arr[i]=='u'))
		 {
			 consAl.add(arr[i]);
		 }
		 
	  }
	  
	  return consAl;
  }
  /*public static ArrayList zero(ArrayList<Integer> arr)
  {
	
	  ArrayList<Integer> zeroAl=new ArrayList<>();
	  for (int i=0;i<arr.size();i++)
	  {
		  if(arr.get(i)==0)
		  {
			  zeroAl.add(arr.get(i));
		  }
	  }
	  System.out.println("yes "+arr);
	  return zeroAl;
  }*/
}
