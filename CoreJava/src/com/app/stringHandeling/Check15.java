package com.app.stringHandeling;

public class Check15 
{

	public static void main(String[] args)
	{
		String name="Sonu";
		//char[]ch=name.toCharArray();
		char[] ch= {'v','i','s','h','w','a','j','e','e','t'};
		String s=new String(ch);
		System.out.println(s);

		byte[] b= {97,98,99};
		String s1=new String(b);
		System.out.println(s1);
		
		byte[] b1= {97,98,99};
		String s3=new String(b1,1,2);
		System.out.println(s3);
		
	}

}
