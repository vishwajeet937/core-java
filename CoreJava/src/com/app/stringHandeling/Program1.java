package com.app.stringHandeling;

public class Program1
{

	public static void main(String[] args) 
	{
		StringBuffer sb=new StringBuffer();
		for(int i=1;i<=17;i++)
		{
			//sb.append(i);
		}
		sb.append(567891011);
		System.out.println(sb.capacity());
		System.out.println(sb.length());

	}

}
