package com.app.oop;

public class ConcreatClassInConstructor 
{
	ConcreatClassInConstructor()
  {
	  this(5335);
	  System.out.println("Default constructor");
  }
	ConcreatClassInConstructor(int i)
  {
	  System.out.println("one parrem constructor");
  }
}
class Check102 extends ConcreatClassInConstructor
{
	Check102()
	  {
		//this(8334344123l);
		System.out.println("Default102");
	  }
	Check102(long l)
	 {
		long mobNo=9570381226l;
		System.out.println("mobNo:"+mobNo);
	 }

	public static void main(String[] args) 
	{
		//TODO Auto-generated method stub
       Check102 c=new Check102();
	}
}
