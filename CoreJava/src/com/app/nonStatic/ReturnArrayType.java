package com.app.nonStatic;

public class ReturnArrayType
{
	public int[] m1()
	{
		System.out.println("m1-Array");
		return new int[] {};
	}
}
class ReturnArrayType1 extends ReturnArrayType
  {
	public int[] m2()
	{
		System.out.println("m2-Array");
		return new int[] {}; 
	}
  

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		ReturnArrayType1 ra=new ReturnArrayType1();
		int[] r=ra.m2();
		ra.m1();

	}

}
