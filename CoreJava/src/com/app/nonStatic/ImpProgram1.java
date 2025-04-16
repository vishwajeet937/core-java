package com.app.nonStatic;

public class ImpProgram1
{ 
	int x;
	ImpProgram1(int x)
	{
		m1(x);
	}
     public void m1(int x)
     {
    	 this.x=3*x;
     }
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int x=10;
		ImpProgram1 ip=new ImpProgram1(101);
		System.out.println("ip reference val is:"+ip.x+"\n"+"x val is:"+x);
				
	}

}
