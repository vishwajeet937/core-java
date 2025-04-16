package com.app.nonStatic;

public class OverLoadedConstructor 
{
	OverLoadedConstructor(int i)
	{
		this(3,2);
		System.out.println(i);
		return;//this is possible
	}
	OverLoadedConstructor(int i,int j)
	{
		this("Raja ram mohan ray",248756);
		System.out.println("val i is:"+i+"\n"+"val j is:"+j);
	}
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		OverLoadedConstructor o=new OverLoadedConstructor(8);

	}
	OverLoadedConstructor(String name,int i)
	{
		System.out.println("name print is:"+name+"\n"+"int val print is:"+i);
	}
}
