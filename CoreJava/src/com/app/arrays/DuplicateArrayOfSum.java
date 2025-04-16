package com.app.arrays;
// ask interview question
public class DuplicateArrayOfSum 
{

	public static void main(String[] args)
	{
		int sum=0;
		int[] arr= {2,3,4,5,6,2,8,9,5,9};
		for (int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					sum+=arr[j];
					System.out.println(arr[j]);
					System.out.println("sum:"+sum);
				}
			}
		}
	}

}
