package com.test;

public class LinearSearch 
{
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
}
