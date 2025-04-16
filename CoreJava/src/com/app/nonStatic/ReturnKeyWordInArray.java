package com.app.nonStatic;

public class ReturnKeyWordInArray 
{
  public static int[] m1(int[] a,ReturnKeyWordInArray r,String name,float f,char ch)
  {
	  int[] arr=new int[] {1,2,3,4,5,6,7,8,9,11};
	  System.out.println("odd Number");

	  for(int i=0;i<arr.length;i++)
	  {
		  if(arr[i]%2==0)
		  {
			  System.out.println(i);
		  }
	  }
	  return new int[] {};
  }
  public static void main(String args[])
  {
	  m1(new int[] {},new ReturnKeyWordInArray(),"return pass val",2.2f,'n');
  }
}
