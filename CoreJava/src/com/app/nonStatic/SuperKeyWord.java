package com.app.nonStatic;

public class SuperKeyWord extends Object
{
    String name="vishwajeet kumar";
    long mobNo=9570381226l;
    public void m3()
    {
    	System.out.println(name);
    }
}
 class Check111 extends SuperKeyWord
    {
	 long mobNo=9117348133l;
    	public void check1()
    	{
    		long mobNo=9939580172l;
    		System.out.println(super.mobNo);
    		System.out.println(mobNo);
    		System.out.println(this.mobNo);
    	}
    }
 class Check22 extends Check111
      {
	      String vill="Mahadeopur";
	       public void check2()
	       {
	    	  String vill="Masaurhi";
	    	   System.out.println(this.vill);
	       }
public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
         Check22 c=new Check22();
         c.m3();
         c.check2();
         c.check1();
	}
}
