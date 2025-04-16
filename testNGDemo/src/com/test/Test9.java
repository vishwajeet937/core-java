package com.test;

public class Test9 
	{
		
		public void test()
		{
			String fName="vishwajeet";
			String lName="kumar";
			long mobNo=9570381226l;
			System.out.println("FName:"+fName+"\n"+"LName:"+lName+"\n"+"MobNo:"+mobNo);
		}
	}
	class Check extends Test9
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
	class Check1 extends Check
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

		public static void main(String[] args) 
		{
			Check1 c=new Check1();
			c.test();
			c.check();
			System.out.println("Hello World!");
		}
	}

