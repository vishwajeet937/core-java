package com.app.stringHandeling;

public class Check14
{

	public static void main(String[] args) 
	{
		StringBuffer sb=new StringBuffer();
		for(int i=1;i<=17;i++)
		{
			sb.append(i);
		}
		System.out.println("capacity:"+sb.capacity());
		System.out.println("length:"+sb.length());

	}

}
