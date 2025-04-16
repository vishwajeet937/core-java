package com.app.logical;

public class $8SeprateOddEven
{

	public static void main(String[] args) 
	{
		int[] arr= {1,2,32,2,3,132,43,5,2121,3,21};
		int oddNumber=arr[0];
		int evenNumber=arr[0];
		int oddNumberStore=arr[0];
		int evennumberStore=arr[0];
		for(int i=0;i<=arr.length;i++)
		{
			if(arr[i]%2==1)
			{
				oddNumber=arr[i];
				System.out.println(oddNumber);
			}
		}

	}

}
