package com.app.oop;
import java.util.Scanner;
public class A17
{
    A17()
    {
    	this("sonu");
    	System.out.println("Zero-parrem Constructor");
    }
    A17(String name)
    {
    	System.out.println("One-parrem Constructor:"+name);
    }
}
 class A18 extends A17
 {
   public static int add(int num)
   {
	   int num1=12;
	   int num2=23;
	   int num3=(num1+num2);
	   System.out.println("add:"+num3);
	   return 11;
   }
  public A18 odd(int num)
  {
	  Scanner scan=new Scanner(System.in);
	  System.out.println("Enter the number");
	  int num1=scan.nextInt();
	  for(int i=0;i<=num1;i++)
	  {
		  if(i%2==0)
		  {
			  System.out.println("odd-Number:"+num1);
		  }
		  else
		  {
			  System.out.println("next");
		  }
	  }
	
	  return new A18();
  }
 }
  class A19 extends A18
  {
	  public void odd (A19 a)
	  {
		  int num=21;
		  for(int i=0;i<=num;i++)
		  {
			if(num%2==0)
			{
				System.out.println("Even is:"+num);
			}
			else
			{
				System.out.println("Next-Line");
			}
		  }
	  }
  
	public static void main(String[] args)
	{
		A19 a=new A19();
		a.add(1);
		a.odd(11);
		a.odd(new A19());
	}

}
