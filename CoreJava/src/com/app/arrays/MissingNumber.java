package com.app.arrays;

public class MissingNumber
{

   public static int missingNumber1(int[] arr)
     {
	int n,sum,restSum=0; 
	int n1=arr.length+1;
	int sum1=n1*(n1+1)/2;
	int restSum1=0;
	for (int i=0 ;i<arr.length ;i++ )
	{
		restSum1+=arr[i];
		int missingNumber=sum1-restSum1;
        
	}
	return restSum1;
   }
public static void main(String[] args) 
{
	
	int[] arr1={1,2,4,5,6};
	System.out.println(missingNumber1(arr1));
}

}
