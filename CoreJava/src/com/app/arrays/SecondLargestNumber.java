package com.app.arrays;

public class SecondLargestNumber 
{
  
	public static void main(String[] args)
	{
		int[] arr={12,324,64,4,13,654,13,56,324,67,87};
		int largestNumber=arr[0];
		int smallestNumber=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>largestNumber)
			{
				largestNumber=arr[i];
			}
			else if(arr[i]<smallestNumber)
			{
				smallestNumber=arr[i];
			}
		}
		System.out.println("Second Largerst Number is:"+arr[arr.length-1]);
       System.out.println(smallestNumber);
	}
	
	

}
