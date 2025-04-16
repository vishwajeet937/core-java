package com.app.arrays;
import java.util.Arrays;
import java.util.Scanner;
public class SmallestAndLargest
{

	public static void main(String[] args) 
	{
		/*Scanner scan=new Scanner(System.in);
		System.out.println("Enetr the numer");
		int valStore=scan.nextInt();
		int[] arr=new int[valStore];*/
		
		int[] arr=new int[] {1,2,3,4,5,6,7,8,9};
		int smallestNumber=arr[0];
		int largestNumber=arr[0];
		for(int i=0;i<arr.length;i++)
		{
				if(arr[i]<smallestNumber)
				{
					smallestNumber=arr[i];
				}
				else if(arr[i]>largestNumber)
				{
					largestNumber=arr[i];
				}
		}
		//System.out.println(Arrays.toString(arr));
		System.out.println("smallestNumaber is:"+smallestNumber);
		System.out.println("LargestNumber is:"+largestNumber);
	}

}
