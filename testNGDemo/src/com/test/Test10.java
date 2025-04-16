package com.test;

public class Test10 
{
	public void test()
	{
		String fName="vishwajeet";
		String lName="kumar";
		long mobNo=9570381226l;
		System.out.println("FName:"+fName+"\n"+"LName:"+lName+"\n"+"MobNo:"+mobNo);
	}
}
class Check extends Test10
{
	
		String fName="Sonu";
		String lName="kumar";
		long mobNo=9570381226l;
		@Override
	public void test()
	{
		
		System.out.println("FName:"+fName+"\n"+"LName:"+lName+"\n"+"MobNo:"+mobNo);
	}
}
class Check2 extends Check1
{
	//@Overload
	public void check()
	{
		int num1=101;
		int num2=102;
		int sum=(num1+num2);
		System.out.println(sum);
	}
	//@Overload
	public void check(int a)
	{
		int i=345;
		int j=123;
		int sub=(i-j);
		System.out.println(sub);
	}

	
}




