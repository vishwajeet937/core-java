package com.app.exceptionHandeling;
class UnCheckedException
{  
	public static void main(String[] args) 
	{
		int i[]=new int[3];
		i[0]=10;
		i[4]=12;
		int x=0;
		int y=1;
		String name="vishwajeet kumar";
		String subName=name.subName(0,name.indexOf(" "));
		System.out.println("subName is:"+subName);
	}
}
