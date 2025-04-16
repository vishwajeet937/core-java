package com.app.stringHandeling;

public class RepalceMethod
{

	public static void main(String[] args)
	{
		String s1="hi ha he ha";
		String s2=s1.replace("ha","Hello");
		System.out.println(s2);
		
		//trim()
		String s3=new String(" hari krishna ");
		String s4=s3.trim();
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s3==s4);
		
		//split()
		String s5="vishwajeet kumar";
		String[] sallery=s5.split("j");
		String[] sallery1=s5.split("m");
		int size=sallery.length;
		for(int i=0;i<size;i++)
		{
			System.out.println(i+"token is:"+sallery[i]);
			System.out.println("Tokan is:"+sallery1[i]);
		}
	}

}
