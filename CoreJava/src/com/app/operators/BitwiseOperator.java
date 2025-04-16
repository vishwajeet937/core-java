package com.app.operators;

public class BitwiseOperator
{
	public static int[] bitwise(int a,int b)
	{
	  if((a&b)==1 || (a&b)==2)
	   {
		System.out.println("Bitwise");
	   }
	  else
	  {
		  System.out.println("Not Bitwise");
	  }
	  return new int[] {2,3};
	}
	public BitwiseOperator bitwise1(int[] a,int[] b)
	{
		int[] arr= new int[]{1,2,3,4,5};
		int[] arr1=new int[]{1,2,3,4,5};
		if(arr!=arr1)
		{
			System.out.println("array");
		}
		else 
		{
			System.out.println("Not match array");
		}
		return new BitwiseOperator();
	}
	public static void main(String[] args)
	{
		bitwise(1,1);
		BitwiseOperator bo=new BitwiseOperator();
		bo.bitwise1(new int[] {},new int[]{});
		
	}

}
