package com.app.logical;

public class Loop1 
{

	public static void main(String[] args) 
	{
		int n=5;
		if(true)
		{
			System.out.println(n);
			if(false)
			{
				System.out.println(n);
			}
			else
			{
				System.out.println("else");
			}
		}
		System.out.println(n);
	}

}
