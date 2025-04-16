package com.app.arrays;

import java.util.Arrays;

public class ClassTypeArray 
{
   private int id;
 
	@Override
	public String toString()
	 {
		return "id: "+id;
	 }
	public static void main(String[] args)
	{
		Object obj=new ClassTypeArray();//lose copling
		ClassTypeArray c=new ClassTypeArray();//Tight copling
		// TODO Auto-generated method stub
		ClassTypeArray[] arr= new ClassTypeArray[]{new ClassTypeArray()};
		ClassTypeArray[] arr2=new ClassTypeArray[] {c};
		System.out.println(c);
		System.out.println(Arrays.toString(arr));
		int[] arr1=new int[] {4,765,65,7};
		System.out.println(Arrays.toString(arr1));
		System.out.println(obj.equals(c));;
		
		/*c.m1(c);
		System.out.println(324);
		
		ClassTypeArray c1=new ClassTypeArray1();
		c1.m1(c1);
		System.out.println();*/
		
	}

}
