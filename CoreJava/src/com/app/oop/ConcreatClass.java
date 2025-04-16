package com.app.oop;

public class ConcreatClass extends Object
{
	String name="ram";
    long mobNo=9570381226l;
    public Integer check()
      {
    	System.out.println(name);
    	return null;
      }
}
 class ConcreatClass1 extends ConcreatClass
 {
   public void check1()
      {
    	System.out.println(super.name);
      }
 }
 class ConcreatClass2 extends ConcreatClass1
 {
   public ConcreatClass2 check2()
   {
	    System.out.println(super.mobNo);
	    return new ConcreatClass2(); 
   }

    public static void main(String[] args)
    {
    	ConcreatClass2 c=new ConcreatClass2();
    	 c.check();
    	 c.check1();
    	 c.check2();
    }
}
