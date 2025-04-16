package com.app.logical;

import java.util.Arrays;
import java.util.Scanner;

public class FindOutOddEven
{
    public static void odd()
      {
    	Scanner scan=new Scanner(System.in);
    	System.out.println("Enter the number");
    	int arr1=scan.nextInt();
    	int[] arr=new int[arr1];
    	//int[] arr= {123,21,3,42,53,65,6578};
    	for (int i=0; i<arr1; i++)
    	{
    		if (i%2==0)
    		{
    			System.out.println(i);
    		}
    	}
     }
    public int[] even(int[] arr1)
    {
    	System.out.println("Even Number");
    	int[] arr={12,34,53,6,755,78,79};
    	for (int i=0;i<arr.length;i++)
    	{
    		if (arr[i]%2==1)
    		{
    			System.out.println(arr[i]);
    		}
    	}
    	return arr1;
    }
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
          odd();
          FindOutOddEven foe=new FindOutOddEven();
          foe.even(new int[] {});
	}

}
