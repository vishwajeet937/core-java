package com.app.logical;

public class reverseNumber
{

	public static void main(String[] args) 
	{
		int[] arr= {1,2,3,4,5,6,7,8,9};
		int sum=0;
		for(int i=arr.length;i>0;i--)
		{
			if(i%2==0)
			{
			System.out.println(i);
			
			sum+=i;
			System.out.println("sum is:"+sum);
			}
		}

	}

}
