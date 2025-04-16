package com.app.nonStatic;

public class ReturnInClassType 
{
	public String m2()
	{
		System.out.println("m2");
		return "strinType";
	}
}
	class ReturnInClassType1 extends ReturnInClassType
	{
		public ReturnInClassType m1()
		{
			System.out.println("output");
			return new ReturnInClassType1();
		}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		ReturnInClassType1 rt=new ReturnInClassType1();
		ReturnInClassType r=rt.m1();
		r.m2();
		//rt.m2();

	}

}
