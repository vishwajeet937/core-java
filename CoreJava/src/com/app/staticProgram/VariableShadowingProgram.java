package com.app.staticProgram;

public class VariableShadowingProgram 
{
	static int a=11;
	static int b=21;
	public static void main(String args[]) 
	{
		int a=101;
		 int b=51;
		// TODO Auto-generated method stub
		System.out.println("a val is:"+a);
		System.out.println("b val is:"+b);
		System.out.println(VariableShadowingProgram.a+" "+"is class level varable");
		System.out.println(VariableShadowingProgram.b+" "+"is class level varable");
         m1(new int[]{});//integer type argument pass value
         VariableShadowingProgram v=new VariableShadowingProgram();
         m2(v);//class type argument pass value
         //BankAccount ba1=new BankAccount();
        //m3(ba1);
	}
	public static void m1(int[] arr)
	{
		int k=90;
		System.out.println(k);
	}
	public static void m2(VariableShadowingProgram vsp)
	{
		int z=234;
		System.out.println(z);
	}
	public static void m3(BankAccount ba)
	{
		int b=87634;
		System.out.println(b);
	}

}
