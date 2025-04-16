package com.app.nonStatic;

public class ImpProgram 
{
   public void m1(int i,int j)
   {
	    i=i+20;
	    j=j+25;
	   System.out.println("inside method:"+i+":"+j);
   }
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int i=100;
		int j=200;
		ImpProgram ip=new ImpProgram();
		ip.m1(i,j);
		System.out.println("After compiling method:"+i+":"+j);
	}

}
