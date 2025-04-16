package com.test;

public class DecendingOrder
{
   public static int[] decending(int arr[])
   {
	   int val=0;
	   for(int i=0 ;i<arr.length ;i++)
	   {
		   for(int j=i+1 ;j<arr.length ;j++)
		   {
			   if(arr[i]<arr[j])
			   {
				   val=arr[j];
				   arr[j]=arr[i];
				   arr[i]=val;
			   }
		   }
	   }
	   return arr;
   }
}
