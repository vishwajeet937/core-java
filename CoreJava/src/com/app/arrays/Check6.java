package com.app.arrays;

import java.util.ArrayList;

public class Check6 
{

	public static void main(String[] args) 
	{
		//int[] arr=new int[] {1,2,3,4,5,6,7,8,9};
		//System.out.println(arr[2]);
		
		/*int[] arr1=new int[5];
		arr1[2]=56;
		arr1[2]=58;
		System.out.println(arr1[2]);*/
		ArrayList<Integer> al=new ArrayList();
		al.add(22);
		al.add(12);
		al.add(34);
		al.set(2, 89);
		
		al.add(1,10);
		//al.add(2);
		for(int obj:al)
		{
		System.out.println(obj);
		}
	}

}
