
package com.app.operators;

public class Addation
{
   public void add(int a,int b,int c1)
   {
		if(a>43 && b>0 || c1<43)
		{
			int c=a+b+c1;
			System.out.println(c);
		}
		else
		{
			int d=b-a;
			System.out.println(d);
		}
   }
	public static void main(String[] args) 
	{
		Addation a=new Addation();
		a.add(20,30,12);

	}

}
