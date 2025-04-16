package com.app.arrays;

import java.util.Scanner;

public class FindMissing 
{

	public static void main(String[] args) 
	{
		//int[] arr=new int[]{1,2,3,5};
       Scanner scan=new Scanner(System.in);
       System.out.println("Enter the number");
       int ar=scan.nextInt();
       int[] arr=new int[ar];
       int missingVal=scan.nextInt();
	   int smallestVal=scan.nextInt();
	   int largestVal=scan.nextInt();
		for (int i=0 ;i<ar ;i++ )
		{ 
			if (arr[i]<smallestVal)
			{
				smallestVal=scan.nextInt();
			}
			else if (arr[i]>largestVal)
			{
				largestVal=scan.nextInt();
			}
		}
		for (int j=0 ;j<ar ;j++ )
		{
             if (arr[j]==missingVal)
             {
				 missingVal=scan.nextInt();
				 missingVal++;
             }
		}
		System.out.println(arr[missingVal]);
	}

}
