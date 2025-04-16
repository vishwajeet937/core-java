package com.test;

public class AccendingOrder
{
  public static int[] accendingOrder(int arr[])
  {
	  //int[] arr1=new int[] {};
	  int storeVal=0;
	  for (int i=0 ;i<arr.length ;i++ )
		{
			for (int j=i+1 ;j<arr.length ;j++ )
			{
             if (arr[j]<arr[i])
				{
					storeVal=arr[i];
					arr[i]=arr[j];
					arr[j]=storeVal;
			    }
			}
		}
	return arr;  
  }
}
