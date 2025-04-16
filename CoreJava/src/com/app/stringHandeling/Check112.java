package com.app.stringHandeling;

public class Check112 {

	public static void main(String[] args) 
	{
		String name="vishwajeet";
		System.out.println("name:"+System.identityHashCode(name));
		String name1="vishwajeet";
		System.out.println("name1:"+System.identityHashCode(name1));
		String name2=new String("vishwajeet");
		System.out.println("name2:"+System.identityHashCode("vishwajeet"));
	}

}
