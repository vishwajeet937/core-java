package com.app.arrays;

import java.util.Arrays;

public class ArrayAcces 
{
 public static void access()
  {
	 int[] arr= {12,324,346,5767,768,43,432,467,9};
	 System.out.println(arr[1]);
	 System.out.println(arr[0]);
	 System.out.println(Arrays.toString(arr));
  }
 public static void access1(int[] arr,int size)
   {
	 int[] arr1= {12,324,346,5767,768,4344,432,467,9};
	 for(int i=0;i<size;i++)
	  {
		 System.out.println(arr1[i]);
	  }
   }
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		ArrayAcces.access();
		ArrayAcces.access1(new int[] {7},8);
	}

}
